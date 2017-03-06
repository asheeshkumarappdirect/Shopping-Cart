package Clients;

import Services.Services_Users;

/**
 * Main file to reach the Services_Users file in Services package
 * Created by asheeshkumar on 2/20/17.
 */

public class Clients_Users
{
    public static void main(String[] args) throws Exception
    {

        Services_Users obj = new Services_Users();
        try
        {
            obj.AddUser();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
