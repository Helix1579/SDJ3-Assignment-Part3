package com.client;

import com.SDJ3.protobuf.House;
import com.SDJ3.protobuf.SlaughterHouseGrpc;
import io.grpc.*;

public class client
{

    public static void main(String[] args)
    {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8080)
                .usePlaintext().build();

        SlaughterHouseGrpc.SlaughterHouseBlockingStub stub = SlaughterHouseGrpc.newBlockingStub(channel);

        String query1 = "SELECT * FROM assignment.animal";

        House.GetDataRequest request = House.GetDataRequest.newBuilder().setQuery(query1).build();
        House.GetDataResponse response = stub.getDataAllAnimals(request);

        for (House.Data data : response.getDataList())
        {
            System.out.println(" Id --> " + data.getId() + "\t" + " regNum --> " + data.getRegNum()
                    + "\t" + " date --> " + data.getDate() + "\t"  + " weight --> " + data.getWeight()
                    + "\t" + " origin --> " + data.getOrigin());
        }
        channel.shutdown();
    }
}
