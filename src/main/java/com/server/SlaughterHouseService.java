package com.server;

import com.SDJ3.protobuf.House;
import com.SDJ3.protobuf.SlaughterHouseGrpc;
import io.grpc.stub.StreamObserver;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SlaughterHouseService extends SlaughterHouseGrpc.SlaughterHouseImplBase
{
    @Override
    public void getDataAllAnimals(House.GetDataRequest request, StreamObserver<House.GetDataResponse> responseObserver)
    {
        List<House.Data_Animal> data_animals = executeAnimalQuery(request.getQuery());

        House.GetDataResponse response = House.GetDataResponse.newBuilder().addAllData1(data_animals).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    //Get all animals
    private List<House.Data_Animal> executeAnimalQuery(String query)
    {
        String url = "jdbc:postgresql://localhost:5432/postgres";
        String username = "postgres";
        String password = "admin";

        List<House.Data_Animal> dataList = new ArrayList<>();

        try
        {
            Connection connection = DriverManager.getConnection(url,username,password);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next())
            {
                long animal_id = resultSet.getLong(1);
                long regNum = resultSet.getLong(2);
                String date = resultSet.getString(3);
                int weight = resultSet.getInt(4);
                String origin = resultSet.getString(5);

                House.Data_Animal data = House.Data_Animal.newBuilder().setAnimalId(animal_id).setAnimalRegNum(regNum)
                        .setDate(date).setWeight(weight).setOrigin(origin).build();

                dataList.add(data);
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        return dataList;
    }

    private List<House.Data_Product> executeProductQuery(String query)
    {
        String url = "jdbc:postgresql://localhost:5432/postgres";
        String username = "postgres";
        String password = "admin";

        List<House.Data_Product> dataList = new ArrayList<>();

        try
        {
            Connection connection = DriverManager.getConnection(url,username,password);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next())
            {
                long product_id = resultSet.getLong(1);
                long product_regNum = resultSet.getLong(2);

                House.Data_Product data = House.Data_Product.newBuilder().setProductId(product_id).setProductRegNum
                        (product_regNum).build();

                dataList.add(data);
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }

        return dataList;
    }
}
