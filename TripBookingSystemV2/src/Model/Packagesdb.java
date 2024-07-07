package Model;
import java.sql.Statement;
import java.util.ArrayList;
import Controller.Packages;
import java.sql.SQLException;
import java.sql.ResultSet;
public class Packagesdb {
         
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
	public ArrayList<Packages> checkPacks() throws ClassNotFoundException ,SQLException {
		ArrayList<Packages> al=new ArrayList<Packages>();
		String query="select * from defaultpackages ";
		ResultSet s=adminQuery(query);
		while(s.next())
		{   
			
			Packages p=new Packages();
			p.setState(s.getString("State"));
			p.setCityname(s.getString("Cityname"));
			p.setplaces(s.getString("Places"));
			p.setTransport(s.getString("Transport"));
			p.setHotel(s.getString("Hotelname"));
			p.setFood(s.getString("Food"));
			p.setDays(s.getString("NoOfDays"));
			p.setDate(s.getString("Date"));
			p.setAdditionals(s.getString("additionals"));
			p.setPrice(s.getString("Price"));
			p.setPackId(s.getString("PackId"));
			
			
			al.add(p);
		}
		return al;
	}

}
