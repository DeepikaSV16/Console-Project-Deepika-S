package Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import Controller.Booking;


public class Bookingdb {
	//method database
	public static void bookingUpdate(String query) throws ClassNotFoundException, SQLException
    {
        Statement stmt=(DbConnection.getConnection()).createStatement();
        stmt.executeUpdate(query);
    }
    public static ResultSet bookingQuery(String query) throws ClassNotFoundException, SQLException
    {
        Statement stmt=(DbConnection.getConnection()).createStatement();
        ResultSet result=stmt.executeQuery(query);
        return result;
    }
	
	//method action
	public boolean checkPid(String getpackageId) throws ClassNotFoundException, SQLException {
		String query="select packId from defaultpackages";
		ResultSet result=bookingQuery(query);
		while(result.next())
		{
			if(result.getString(1).equals(getpackageId))
			{
				return true;
			}
		}
		return false;
	}
	public void addBook(Booking b) throws ClassNotFoundException, SQLException {
		
		String query="insert into Bookings(`Username`,`Email`,`Phonenumber`,`PackageId`,`State`,`NoOfDays`,`Date`,`Price`,`NoOfPeople`,`BookStatus`) values('"+b.getname()+"','"+b.getEmail()+"','"+b.getPhonenumber()+"','"+b.getpackageId()+"','"+b.getState()+"','"+b.getNodays()+"','"+b.getDate()+"','"+b.getPrice()+"','"+b.getNoOfPeople()+"','null')";
		bookingUpdate(query);
		}
	public static ArrayList<Booking> checkPacks(String email) throws ClassNotFoundException ,SQLException {
		ArrayList<Booking> a2=new ArrayList<Booking>();
		String query="select PackageId,State,NoOfDays,Date,Price,NoOfPeople,BookStatus from bookings where email ='"+email+"';";
		ResultSet s=bookingQuery(query);
		while(s.next())
		{   
			
			Booking p=new Booking();
			p.setpackageId(s.getString("PackageId"));
			p.setState(s.getString("State"));
			p.setNodays(s.getString("NoOfDays"));
			p.setDate(s.getString("Date"));
			p.setPrice(s.getString("Price"));
			p.setNoOfPeople(s.getString("NoOfPeople"));
			p.setBookStatus(s.getString("BookStatus"));
			
			
			a2.add(p);
		}
		return a2;
	
}
	
	
}
