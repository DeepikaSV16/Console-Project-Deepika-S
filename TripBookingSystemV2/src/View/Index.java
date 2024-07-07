package View;
import java.util.Scanner;
import java.sql.SQLException;
import Model.Userdb;
import View.UserView;
public class Index
{
	private static final int Register=1;
	private static final int login=2;
	private static final int exit=3;
	 static Userdb in=new Userdb();
	public static void main(String[]args) throws Exception
	{
		Scanner d=new Scanner(System.in);
		System.out.println("\n==================================================================================");
		System.out.println("\n                         Welcome To Trip Booking System          ");
		System.out.println("\n==================================================================================");
		System.out.println();
		System.out.println("Enter 1 to Register   ");
		System.out.println("Enter 2 to Login      ");
		System.out.println("Enter 3 to Exit       ");
		
		System.out.println("Enter Your Choice   :");
		int choice=d.nextInt();
		try
		{
		if(choice==1)
		{
         UserView.register();
         System.out.println("Registration Successful..........\n");
         System.out.println("Enter 1 to Login :          ");
         System.out.println("Enter 2 to Exit  :          ");
         int c=d.nextInt();
         if(c==1)
         {
        	 UserView.login();
         }
         else
         {
        	 System.out.println("\nThanks For Visiting.........Have a Nice day!");
         }
		}
		else if(choice==2)
		{
			UserView.login();
		}
		else if(choice==3)
		{
			System.out.println("ThankYou For Visiting.........Have a Nice Day!");
		}
		else
		{
		    System.out.println("Invalid Registration..........Try Again Later!");
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}