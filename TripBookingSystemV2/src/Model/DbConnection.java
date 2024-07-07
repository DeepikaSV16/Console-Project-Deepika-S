package Model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection
{
        private static Connection con = null;
        static
        {
            try 
            {
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/trip_bookingv2", "root","Deepika@16");
            }
            catch (ClassNotFoundException | SQLException e) 
            {
                e.printStackTrace();
            }
        }
        public static Connection getConnection()
        {
            return con;
        }
}