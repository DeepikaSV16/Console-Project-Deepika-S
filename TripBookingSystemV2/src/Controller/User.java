package Controller;
import Model.Userdb;
import View.UserView;
public class User {
     private  String Username;
     private  String Password;
     private  String Email;
     private String Phonenumber;
     public User()
     {
    	
    	this.Username="";
    	this.Password="";
    	this.Email="";
    	this.Phonenumber="";
     }
     public void setUsername(String Username)
     {
    	 this.Username=Username;
     }
     public String getUsername()
     {
    	 return this.Username;
     }
     public void setPassword(String Password)
     {
    	 this.Password=Password;
     }
     public String getPassword()
     {
    	 return this.Password;
     }
     public void setEmail(String Email)
     {
    	 this.Email=Email;
     }
     public String getEmail()
     {
    	 return this.Email;
     }
     public void setPhonenumber(String Phonenumber)
     {
    	 this.Phonenumber=Phonenumber;
     }
     public String getPhonenumber()
     {
    	 return this.Phonenumber;
     }
	
}
