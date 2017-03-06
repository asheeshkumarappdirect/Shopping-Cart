package Domain;

/**
 * File to get and set the values of columns in Users table
 * Created by asheeshkumar on 2/20/17.
 */

public class Domain_Users {
    private int User_Id;
    private String User_Name;
    private String User_Address;
    private String User_Email;

    public Domain_Users() {

    }

    public Domain_Users(int User_Id, String User_Name, String User_Address, String User_Email) {
        this.User_Id = User_Id;
        this.User_Name = User_Name;
        this.User_Address = User_Address;
        this.User_Email = User_Email;
    }

    public int getUser_Id() {
        return User_Id;
    }

    public void setUser_Id(int User_Id) {
        this.User_Id = User_Id;
    }

    public String getUser_Name() {
        return User_Name;
    }

    public void setUser_Name(String User_Name) {
        this.User_Name = User_Name;
    }

    public String getUser_Address() {
        return User_Address;
    }

    public void setUser_Address(String User_Address)
    {
        this.User_Address = User_Address;
    }

    public String getUser_Email()
    {
        return User_Email;
    }

    public void setUser_Email(String User_Email)
    {
        this.User_Email = User_Email;
    }

    @Override
    public String toString() {
        return "User{" +
                "UserId=" + User_Id +
                ", Name='" + User_Name + '\'' +
                ", Address='" + User_Address + '\'' +
                ", Email='" + User_Email + '\'' +
                '}';
    }
}
