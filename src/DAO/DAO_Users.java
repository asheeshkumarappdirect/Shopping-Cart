package DAO;

import Domain.Domain_Users;

import java.util.Scanner;
import java.sql.*;

/**
 *File to connect to the database and inserting values of Users.text to Users table in ShoppingCart database
 * Created by asheeshkumar on 2/20/17.
 */

interface daousers
{
    void Insert(Domain_Users duobj) throws Exception;
}
public class DAO_Users implements daousers
{
    //Scanner sc= new Scanner(System.in);

    public void Insert(Domain_Users duobj) throws Exception
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

        Connection con = DBConnection.getConnection();
        System.out.println("Connection Established ");

        Class.forName("com.mysql.jdbc.Driver");
        PreparedStatement pst = con.prepareStatement("insert into Users (User_Name, User_Address, User_Email) values (?,?,?)");
        pst.setString(1, duobj.getUser_Name());
        pst.setString(2, duobj.getUser_Address());
        pst.setString(3, duobj.getUser_Email());
        pst.executeUpdate();

        con.close();
    }

}
