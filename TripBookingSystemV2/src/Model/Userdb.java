package Model;
import java.sql.Statement;

import Controller.User;

import java.sql.SQLException;
import java.sql.ResultSet;
public class Userdb
{
	public static void adminUpdate(String query) throws ClassNotFoundException, SQLException
    {
        Statement stmt=(DbConnection.getConnection()).createStatement();
        stmt.executeUpdate(query);
    }
    public static ResultSet adminQuery(String query) throws ClassNotFoundException, SQLException
    {
        Statement stmt=(DbConnection.getConnection()).createStatement();
        ResultSet result=stmt.executeQuery(query);
        return result;
    }
	public static void addUser(User u) throws ClassNotFoundException, SQLException
	{
		
		String query="insert into customer (`Username`,`Password`,`Email`,`Phonenumber`) values('"+u.getUsername()+"','"+u.getPassword()+"','"+u.getEmail()+"','"+u.getPhonenumber()+"')";
		adminUpdate(query);
	}
	public Object checkPass(String username) throws SQLException, ClassNotFoundException {
		String query="SELECT Password FROM customer WHERE Username='"+username+"';";
		ResultSet result=adminQuery(query);
		while(result.next())
			return result.getString("Password");
		return "";
	}
	public String email(String uname) throws ClassNotFoundException, SQLException
	{
		String query="SELECT email FROM customer WHERE Username='"+uname+"';";
		ResultSet result=adminQuery(query);
		while(result.next())
			return result.getString("email");
		return "";
	}
	
}
