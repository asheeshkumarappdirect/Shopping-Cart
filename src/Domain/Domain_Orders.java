package Domain;

import java.sql.Timestamp;

/**
 * File to get and set the values of columns in Orders table
 * Created by asheeshkumar on 2/20/17.
 */

public class Domain_Orders
{
    private int OrderId;
    private int Order_UserId;
    private Timestamp timestamp;
    private String Order_Status;

    public Domain_Orders(int OrderId, int Order_UserId, Timestamp timestamp, String Order_Status)
    {
        this.OrderId = OrderId;
        this.Order_UserId = Order_UserId;
        this.timestamp = timestamp;
        this.Order_Status = Order_Status;
    }

    public Domain_Orders()
    {

    }

    public int getOrderId()
    {
        return OrderId;
    }

    public void setOrderId(int Orderid)
    {
        this.OrderId = OrderId;
    }

    public int getOrder_UserId()
    {
        return Order_UserId;
    }

    public void setOrder_UserId(int Order_UserId)
    {
        this.Order_UserId = Order_UserId;
    }

    public Timestamp getTimestamp()
    {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp)
    {
        this.timestamp = timestamp;
    }

    public String getOrder_Status()
    {
        return Order_Status;
    }

    public void setOrder_Status(String Order_Status)
    {
        this.Order_Status = Order_Status;
    }

    @Override
    public String toString()
    {
        return "Order{" +
                "OrderId=" + OrderId +
                ", UserId=" + Order_UserId+
                ", CreatedDate=" + timestamp +
                ", Status='" + Order_Status + '\'' +
                '}';
    }

    public Timestamp GetTimestamp(String str)
    {
        return timestamp;
    }
}
