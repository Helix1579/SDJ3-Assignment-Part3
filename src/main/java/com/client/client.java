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

        String query1 = "SELECT * FROM assignment.animals";
        String query2 = "SELECT * FROM assignment.product";
        String query3 = "SELECT assignment.animals.animal_id, assignment.product.product_id,  assignment.animals.animal_regNum,  assignment.product.product_regNum FROM\n" +
                "assignment.animals JOIN  assignment.product ON  assignment.animals.animal_id =  assignment.product.animal_id;";

        // Animal get data
        House.GetDataRequest requestAnimal = House.GetDataRequest.newBuilder().setQuery1(query1).build();
        House.GetDataResponse responseAnimal = stub.getDataAllAnimals(requestAnimal);

        System.out.println("\t\t\t\t\n\nAll Animals\n");

        for (House.Data_Animal data : responseAnimal.getData1List())
        {
            System.out.println(" animalId --> " + data.getAnimalId() + "\t" + " regNum --> " + data.getAnimalRegNum()
                    + "\t" + " date --> " + data.getDate() + "\t"  + " weight --> " + data.getWeight()
                    + "\t" + " origin --> " + data.getOrigin());
        }

        System.out.println("\n\n\n");

        // Product get data
        House.GetDataRequest requestProduct = House.GetDataRequest.newBuilder().setQuery2(query2).build();
        House.GetDataResponse responseProduct = stub.getDataAllProducts(requestProduct);

        System.out.println("\t\t\t\t\n\nAll Products\n");
        for (House.Data_Product data : responseProduct.getData2List())
        {
            System.out.println(" productId --> " + data.getProductId() + "\t" + " product_regNum --> " + data.getProductRegnum());
        }

        System.out.println("\n\n\n");

        //Display all products with animaId

        House.GetDataRequest request = House.GetDataRequest.newBuilder().setQuery3(query3).build();
        House.GetDataResponse response = stub.getDataAnimalProduct(request);

        System.out.println("\t\t\n\nAll Products with animal_id\n");

        for (House.Data_Product_Animal data : response.getData3List())
        {
            System.out.println(" animalId --> " + data.getAnimalId() + "\t" + " productId --> " + data.getProductId() + "\t"
            + " product_regNum --> " + data.getProductRegNum() + "\t" + " animal_regNum --> " + data.getAnimalRegNum());
        }

        System.out.println("\n\n\n");
    }
}
