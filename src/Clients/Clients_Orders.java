package Clients;

import Services.Services_Orders;

/**
 *Main file to reach the Clinet_Users file in Services package
 * Created by asheeshkumar on 2/20/17.
 */

public class Clients_Orders
{
    public static void main(String[] args) throws Exception
    {
        Services_Orders sd_obj = new Services_Orders();
        try
        {
            sd_obj.AddOrder();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
