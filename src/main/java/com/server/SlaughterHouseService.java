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
        List<House.Data> data = executeQuery(request.getQuery());

        House.GetDataResponse response = House.GetDataResponse.newBuilder().addAllData(data).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    //Get all animals
    private List<House.Data> executeQuery(String query)
    {
        String url = "jdbc:postgresql://localhost:5432/postgres";
        String username = "postgres";
        String password = "admin";

        List<House.Data> dataList = new ArrayList<>();

        try
        {
            Connection connection = DriverManager.getConnection(url,username,password);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next())
            {
                long Id = resultSet.getLong(1);
                long regNum = resultSet.getLong(2);
                String date = resultSet.getString(3);
                int weight = resultSet.getInt(4);
                String origin = resultSet.getString(5);

                House.Data data = House.Data.newBuilder().setId(Id).setRegNum(regNum)
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
}
