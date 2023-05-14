package com.client;

import com.SDJ3.protobuf.House;
import com.SDJ3.protobuf.SlaughterHouseGrpc;
import io.grpc.*;

public class client
{
    public static void main(String[] args)
    {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9090)
                .usePlaintext().build();

        SlaughterHouseGrpc.SlaughterHouseBlockingStub stub = SlaughterHouseGrpc.newBlockingStub(channel);

        String query1 = "SELECT * FROM animals";
        String query2 = "SELECT * FROM products";
        String query3 = "SELECT animals.animal_id, products.product_id, animals.animal_reg_no,\n" +
                "products.product_reg_no, animals.origin FROM\n" +
                "animals JOIN products ON animals.animal_id = products.animal_id ORDER BY \n" +
                "animals.animal_id;";

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
            + " product_regNum --> " + data.getProductRegNum() + "\t" + " animal_regNum --> " + data.getAnimalRegNum() + "\t" + "animal_origin --> " + data.getOrigin());
        }

        System.out.println("\n\n\n");
    }
}
