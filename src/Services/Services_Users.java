package Services;

import DAO.*;
import Domain.*;
import java.io.BufferedReader;
import java.io.FileReader;

/**
 * File to read user data from Users.text
 * Created by asheeshkumar on 2/20/17.
 */

 interface serviceusers
{
    void AddUser() throws Exception;
}

public class Services_Users implements serviceusers
{
    public void AddUser() throws Exception
    {
        BufferedReader br = new BufferedReader(new FileReader("Resources/Users.text"));
        DAO_Users obj = new DAO_Users();

        String space = " ";
        Domain_Users duobj = new Domain_Users();

        while((space=br.readLine())!= null)
        {
            String str[] = space.split(",");
            duobj.setUser_Id(Integer.parseInt(str[0]));
            duobj.setUser_Name(str[1]);
            duobj.setUser_Address(str[2]);
            duobj.setUser_Email(str[3]);
            obj.Insert(duobj);
        }


    }

}
