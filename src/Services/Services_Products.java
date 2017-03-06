package Services;

import DAO.DAO_Products;
import Domain.Domain_Products;
import java.io.BufferedReader;
import java.io.FileReader;

/**
 * File to read user data from Products.text
 * Created by asheeshkumar on 2/20/17.
 */

interface serviceproducts
{
    void AddProduct() throws Exception;
}

public class Services_Products implements serviceproducts
{
    public void AddProduct() throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("Resources/Products.text"));
        DAO_Products obj = new DAO_Products();

        String space = " ";
        Domain_Products dpobj = new Domain_Products();

        while ((space = br.readLine()) != null) {
            String str[] = space.split(",");
            //dpobj.setProduct_Id(Integer.parseInt(str[0]));
            dpobj.setProduct_Name(str[1]);
            dpobj.setProduct_Qty(Integer.parseInt(str[2]));
            dpobj.setProduct_UnitPrice(Integer.parseInt(str[3]));
            obj.Insert(dpobj);
        }
    }

    public void UpdateById(int Product_Id, int Product_Qty) throws Exception
    {
        DAO_Products dao_p = new DAO_Products();
        dao_p.UpdateById(Product_Id, Product_Qty);
    }

    public Domain_Products GetById(int id) throws Exception
    {
        DAO_Products dao_p = new DAO_Products();
        return dao_p.GetById(id);
    }
}
