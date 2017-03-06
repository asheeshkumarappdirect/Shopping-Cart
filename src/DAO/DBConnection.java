package DAO;

import java.sql.*;

/**
 * File to create connection with database
 * Created by asheeshkumar on 2/20/17.
 */

public class DBConnection
{
    public static Connection getConnection() throws ClassNotFoundException, Exception
    {
        //Loading JDBC Driver
        Class.forName("com.mysql.jdbc.Driver");
        //System.out.println("JDBC Driver Loaded.");

        //Creating Connection with Database
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ShoppingCart" , "root","password");
        //System.out.println("Database connection established");
        return con;
    }
}