package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *File to get information of bill from database
 * Created by asheeshkumar on 2/23/17.
 */

public class DAO_Bill
{
    public static ArrayList<Integer> Bill_Details(int Order_Id) throws Exception
    {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        ArrayList<Integer> list = new ArrayList<>();

        try
        {
            con = DBConnection.getConnection();
            ps = con.prepareStatement("select * from OrderDetails where Od_Id = ?");
            ps.setInt(1,Order_Id);
            rs = ps.executeQuery();
            while (rs.next())
            {
                int qty = rs.getInt("Od_Qty");
                int productId = rs.getInt("Od_Product_Id");

                list.add(qty);
                list.add(productId);
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        return list;
    }
}
