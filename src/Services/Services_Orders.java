package Services;

import DAO.DAO_Orders;
import Domain.Domain_OrderDetails;
import Domain.Domain_Orders;
import Domain.Domain_Products;
import java.io.BufferedReader;
import java.io.FileReader;

/**
 * File to read user data from Orders.text
 * Created by asheeshkumar on 2/20/17.
 */

interface servicesorders
{
    void AddOrder() throws Exception;
}

public class Services_Orders implements servicesorders
{
    public void AddOrder() throws Exception
    {
        String space = "";
        BufferedReader br = new BufferedReader(new FileReader("Resources/Orders.text"));
        DAO_Orders obj = new DAO_Orders();

        Domain_Orders do_obj = new Domain_Orders();

        Services_OrderDetails sod =new Services_OrderDetails();

        Services_Products sp =new Services_Products();

        String row1 = br.readLine();
        int User_Id = Integer.parseInt(row1);
        int Order_Id = 0;

        do_obj.setOrder_UserId(User_Id);
        do_obj.setOrder_Status("Confirmed");

        try
        {
            Order_Id =obj.PlaceOrder(do_obj);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        System.out.println("-------------------------------------");
        while((space=br.readLine())!=null)
        {
            String[] str = space.split(",");
            int ProductId = Integer.parseInt(str[0]);
            int Qty = Integer.parseInt(str[1]);

            Domain_OrderDetails dod_obj = new Domain_OrderDetails();
            dod_obj.setOd_Id(Order_Id);
            dod_obj.setOd_ProductId(ProductId);
            dod_obj.setOd_Qty(Qty);

            sod.PlaceOrder(dod_obj);

            Domain_Products dp = sp.GetById(ProductId);
            int UpdateQty = dp.getProduct_Qty() - Qty;
            System.out.println(UpdateQty);
            sp.UpdateById(ProductId, UpdateQty);

            Services_Bill sb = new Services_Bill();
            sb.Bill_Generate(Order_Id);
        }
    }
}
