package Services;

import DAO.*;
import Domain.Domain_Products;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

/**
 * Created by asheeshkumar on 2/24/17.
 */

public class Services_Bill
{
    public void Bill_Generate(int order_Id) throws Exception
    {
        File file = new File("Resources/FinalBill.csv");
        DAO_Bill dao_Bill = new DAO_Bill();
        try
        {
            file.createNewFile();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        Domain_Products dp = new Domain_Products();
        String p_name = "";
        int price=0,productquantity=0,p_price=0;

        Services_Products sp = new Services_Products();
        ArrayList<Integer> arrayList = dao_Bill.Bill_Details(order_Id);
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write("Order Id: "+ order_Id+"\n");

        String row = "Name,Quantity,InitialPrice,Total";
        fileWriter.write(row+ "\n");
        int quantity=0,productid=0;
        int grossTotal=0;

        for(int i=0;i<arrayList.size();i+=2)
        {
            quantity = arrayList.get(i);
            productid = arrayList.get(i + 1);
            dp = sp.GetById(productid);

            p_price = dp.getProduct_UnitPrice();
            p_name = dp.getProduct_Name();

            int total = p_price * quantity;
            grossTotal = grossTotal + total;

            row = "" + p_name + "," + quantity + "," + p_price + "," + total;
            fileWriter.write(row);
            fileWriter.write("\n");
        }
        fileWriter.write("Total Price= " + grossTotal);
        fileWriter.flush();
        fileWriter.close();
    }
}
