package Domain;

/**
 * File to get and set the values of columns in Order_Details table
 * Created by asheeshkumar on 2/20/17.
 */

public class Domain_OrderDetails
{
    private int Od_Id;
    private int Od_ProductId;
    private int Od_Qty;


    public int getOd_Id()
    {
        return Od_Id;
    }

    public void setOd_Id(int O_Id)
    {
        this.Od_Id = O_Id;
    }

    public int getOd_ProductId()
    {
        return Od_ProductId;
    }

    public void setOd_ProductId(int Od_ProductId)
    {
        this.Od_ProductId = Od_ProductId;
    }

    public int getOd_Qty()
    {
        return Od_Qty;
    }

    public void setOd_Qty(int Od_Qty)
    {
        this.Od_Qty = Od_Qty;
    }


    @Override
    public String toString() {
        return "OrderDetails{" +
                "OrderDetailsId=" + Od_Id +
                ", OrderDetailsProductId=" + Od_ProductId +
                ", OrderDetailsQty=" + Od_Qty +
                '}';
    }
}
