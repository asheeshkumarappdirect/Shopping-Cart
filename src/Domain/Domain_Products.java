package Domain;

/**
 * File to get and set the values of columns in Prdducts table
 * Created by asheeshkumar on 2/20/17.
 */

public class Domain_Products
{
    private int Product_Id;
    private String Product_Name;
    int Product_Qty;
    int Product_UnitPrice;

    public Domain_Products()
    {
    }

    public Domain_Products( int Product_Id, String Product_Name, int Product_Qty, int Product_UnitPrice)
    {
        this.Product_Id = Product_Id;
        this.Product_Name = Product_Name;
        this.Product_Qty = Product_Qty;
        this.Product_UnitPrice = Product_UnitPrice;
    }

    public int getProduct_Id()
    {
        return Product_Id;
    }

    public void setProduct_Id(int Product_Id)
    {
        this.Product_Id = Product_Id;
    }

    public String getProduct_Name()
    {
        return Product_Name;
    }

    public void setProduct_Name(String Product_Name)
    {
        this.Product_Name = Product_Name;
    }

    public int getProduct_Qty()
    {
        return Product_Qty;
    }

    public void setProduct_Qty(int Product_Qty)
    {
        this.Product_Qty = Product_Qty;
    }

    public int getProduct_UnitPrice()
    {
        return Product_UnitPrice;
    }

    public void setProduct_UnitPrice(int Product_UnitPrice)
    {
        this.Product_UnitPrice = Product_UnitPrice;
    }

    @Override
    public String toString()
    {
        return "Product{" + "ProductId=" + Product_Id +
                ", ProductName='" + Product_Name + '\'' +
                ", Quantity=" + Product_Qty +
                ", UnitPrice=" + Product_UnitPrice +
                '}';
    }
}
