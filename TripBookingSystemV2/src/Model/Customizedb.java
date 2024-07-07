package Model;
import Controller.Customize;

import java.sql.Statement;
import java.util.ArrayList;
import java.sql.SQLException;
import java.sql.ResultSet;

public class Customizedb {
	public static void customUpdate(String query) throws ClassNotFoundException, SQLException
    {
        Statement stmt=(DbConnection.getConnection()).createStatement();
        stmt.executeUpdate(query);
    }
    public static ResultSet customQuery(String query) throws ClassNotFoundException, SQLException
    {
        Statement stmt=(DbConnection.getConnection()).createStatement();
        ResultSet result=stmt.executeQuery(query);
        return result;
    }
	public void addCustom(Customize c) throws ClassNotFoundException, SQLException {
		String query="insert into customize (`Name`,`EMail`,`Phonenumber`,`State`,`City`,`Places`,`Transport`,`Hotel`,`Days`,`Date`,`NoOfPeople`,`BookStatus`) values('"+c.getName()+"','"+c.getEmail()+"','"+c.getPhonenumber()+"','"+c.getState()+"','"+c.getCity()+"','"+c.getPlaces()+"','"+c.getTransport()+"','"+c.getHotel()+"','"+c.getDays()+"','"+c.getDate()+"','"+c.getPeople()+"','"+c.getBookStatus()+"')";
		customUpdate(query);
	}
	
	public static ArrayList<Customize> checkPacks(String email) throws ClassNotFoundException ,SQLException {
		ArrayList<Customize> al=new ArrayList<>();
		String query="select State,City,Places,Transport,Hotel,Days,Date,NoOfPeople,BookStatus from customize where email='"+email+"';";
		ResultSet s=customQuery(query);
		while(s.next())
		{   
			
			Customize p=new Customize();
			p.setState(s.getString("State"));
			p.setCity(s.getString("City"));
			p.setPlaces(s.getString("Places"));
			p.setTransport(s.getString("Transport"));
			p.setHotel(s.getString("Hotel"));
			p.setDays(s.getString("Days"));
			p.setDate(s.getString("Date"));
			p.setPeople(s.getString("NoOfPeople"));
			p.setBookStatus(s.getString("BookStatus"));
			
			
			al.add(p);
		}
		return al;
	
}
}
