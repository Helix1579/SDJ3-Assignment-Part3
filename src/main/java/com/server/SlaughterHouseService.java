package com.server;

import com.SDJ3.protobuf.House;
import com.SDJ3.protobuf.SlaughterHouseGrpc;
import io.grpc.stub.StreamObserver;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SlaughterHouseService extends SlaughterHouseGrpc.SlaughterHouseImplBase
{
    //<------------------------------------------------------------------------------------------------------------------------------>

    @Override public void getDataAllAnimals(House.GetDataRequest request, StreamObserver<House.GetDataResponse> responseObserver)
    {
        List<House.Data_Animal> data_animals = executeAnimalQuery(request.getQuery1());

        House.GetDataResponse response = House.GetDataResponse.newBuilder().addAllData1(data_animals).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
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
                String regNum = resultSet.getString(2);
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


//<------------------------------------------------------------------------------------------------------------------------------>
    @Override public void getDataAllProducts(House.GetDataRequest request, StreamObserver<House.GetDataResponse> responseObserver)
    {
        List<House.Data_Product> data_product = executeProductQuery(request.getQuery2());

        House.GetDataResponse response = House.GetDataResponse.newBuilder().addAllData2(data_product).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
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
                String product_regNum = resultSet.getString(2);

                House.Data_Product data = House.Data_Product.newBuilder().setProductId(product_id).setProductRegnum
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

//<------------------------------------------------------------------------------------------------------------------------------>

    @Override public void getDataAnimalProduct(House.GetDataRequest request, StreamObserver<House.GetDataResponse> responseObserver)
    {
        List<House.Data_Product_Animal> data_product_animals = executeAnimalProductQuery(request.getQuery3());

        House.GetDataResponse response = House.GetDataResponse.newBuilder().addAllData3(data_product_animals).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    private List<House.Data_Product_Animal> executeAnimalProductQuery(String query)
    {

        String url = "jdbc:postgresql://localhost:5432/postgres";
        String username = "postgres";
        String password = "admin";

        List<House.Data_Product_Animal> dataList = new ArrayList<>();
        try
        {
            Connection connection = DriverManager.getConnection(url,username,password);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next())
            {
                long animal_id = resultSet.getLong(1);
                long product_id = resultSet.getLong(2);
                String animal_regNum = resultSet.getString(3);
                String product_regNum = resultSet.getString(4);
                String animal_origin = resultSet.getString(5);

                House.Data_Product_Animal data = House.Data_Product_Animal.newBuilder().setAnimalId(animal_id)
                        .setProductId(product_id).setAnimalRegNum(animal_regNum).setProductRegNum(product_regNum).setOrigin(animal_origin).build();

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
