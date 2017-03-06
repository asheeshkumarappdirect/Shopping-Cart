package Services;

import DAO.DAO_OrderDetails;
import Domain.Domain_OrderDetails;

/**
 * Created by asheeshkumar on 2/20/17.
 */

interface servicesorderdetails
{
    void PlaceOrder(Domain_OrderDetails obj) throws Exception;
}

public class Services_OrderDetails implements servicesorderdetails
{
    DAO_OrderDetails doobj =new DAO_OrderDetails();

    public void PlaceOrder(Domain_OrderDetails obj) throws Exception
    {
        doobj.OrderPlaced(obj);

    }
}
