package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import Domain.Domain_Products;
import java.sql.ResultSet;
import java.util.Scanner;

/**
 * File where the details of Products is stored in Products table
 * Created by asheeshkumar on 2/20/17.
 */

interface daoproducts
{
    void Insert(Domain_Products dpobj) throws Exception;
    void UpdateById(int Product_Id, int Product_Qty) throws Exception;
    public Domain_Products GetById(int id) throws Exception;
}

public class DAO_Products implements daoproducts
{
    Scanner sc= new Scanner(System.in);

    public void Insert(Domain_Products dpobj) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        try {
            Class.forName("com.mysql.jdbc.Driver");

        } catch (Exception e) {
            e.printStackTrace();
        }

        Connection con = DBConnection.getConnection();
        System.out.println("Enter ");

        PreparedStatement pst = con.prepareStatement("insert into Products (Product_Name, Product_Qty, Product_UnitPrice) values (?,?,?)");
        pst.setString(1, dpobj.getProduct_Name());
        pst.setInt(2, dpobj.getProduct_Qty());
        pst.setInt(3, dpobj.getProduct_UnitPrice());
        pst.executeUpdate();
    }

    public void UpdateById(int Product_Id, int Product_Qty) throws Exception
    {
        Connection con = DBConnection.getConnection();

        PreparedStatement pst = con.prepareStatement("update Products set Product_Qty = ? where Product_Id = ?");
        pst.setInt(1,Product_Qty);
        pst.setInt(2,Product_Id);

        pst.executeUpdate();
    }

    public Domain_Products GetById(int id) throws Exception
    {
        Connection con = DBConnection.getConnection();

        PreparedStatement pst = con.prepareStatement("select * from Products where Product_Id=?");
        pst.setInt(1,id);
        Domain_Products dp = null;

        ResultSet rs = pst.executeQuery();
        if(rs.next())
        {
            dp = new Domain_Products();
            dp.setProduct_Id(rs.getInt(1));
            dp.setProduct_Name(rs.getString(2));
            dp.setProduct_Qty(rs.getInt(3));
            dp.setProduct_UnitPrice(rs.getInt(4));
        }
        return dp;
    }

}
