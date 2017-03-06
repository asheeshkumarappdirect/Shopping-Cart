package DAO;

import Domain.Domain_OrderDetails;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 * File where the details of order is stored in OrderDetails table
 * Created by asheeshkumar on 2/20/17.
 */

interface daoorderdetails
{
    void OrderPlaced(Domain_OrderDetails obj) throws Exception;
}

public class DAO_OrderDetails implements daoorderdetails
{
    public void OrderPlaced(Domain_OrderDetails obj) throws Exception
    {
        Connection con = DBConnection.getConnection();

        int Od_Id = obj.getOd_Id();
        int Od_Product_Id = obj.getOd_ProductId();
        int Od_Qty = obj.getOd_Qty();

        PreparedStatement pst = con.prepareStatement("insert into OrderDetails values (?,?,?)");
        pst.setInt(1,Od_Id);
        pst.setInt(2,Od_Product_Id);
        pst.setInt(3,Od_Qty);

        pst.executeUpdate();
    }
}
