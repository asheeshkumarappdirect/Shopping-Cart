package Clients;

import Services.Services_Products;

/**
 * Main file to reach the Products_Users file in Services package
 * Created by asheeshkumar on 2/20/17.
 */

public class Clients_Products
{
    public static void main(String[] args) throws Exception {
        Services_Products obj = new Services_Products();
        try
        {
            obj.AddProduct();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
