package DAO;

import Domain.Domain_Orders;
import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.Date;

/**
 * File where the details of order is stored in Orders table
 * Created by asheeshkumar on 2/20/17.
 */

interface daoorders
{
    int PlaceOrder(Domain_Orders do_obj) throws Exception;
}

public class DAO_Orders implements daoorders
{
    public int PlaceOrder(Domain_Orders do_obj) throws Exception
    {
        Connection con = DBConnection.getConnection();

        int User_Id = do_obj.getOrder_UserId();
        String Status = do_obj.getOrder_Status();

        Timestamp t = new Timestamp(new Date().getTime());

        String query = "insert into Orders (Order_UserId, Order_Date, Order_Status) values (?,?,?)";
        PreparedStatement pst = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);

        int Order_Id = 0;

        pst.setInt(1,User_Id);
        pst.setTimestamp(2,t);
        pst.setString(3, Status);
        pst.execute();

        ResultSet rs = pst.getGeneratedKeys();
        if(rs.next())
        {
            Order_Id = rs.getInt(1);
        }
        return Order_Id;
    }
}
