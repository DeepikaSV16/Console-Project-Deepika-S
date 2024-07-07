package View;
import java.util.*;
import java.sql.SQLException;

import Controller.Booking;
import Controller.Customize;

import Controller.User;
import Model.Bookingdb;
import Model.Customizedb;
import Model.Userdb;

public class UserView {
	
	static Scanner d=new Scanner(System.in);
	static Userdb user=new Userdb();
    public static  void register() throws ClassNotFoundException,SQLException
    {
    	User u=new User();
    	System.out.println("\n------------------------------------------");
    	System.out.println("Enter Username        :");
    	u.setUsername(d.next());
    	System.out.println("Enter Password        :");
    	u.setPassword(d.next());
    	System.out.println("Enter Emailid         :");
    	u.setEmail(d.next());
    	System.out.println("Enter Phonenumber     :");	
    	u.setPhonenumber(d.next());
    	user.addUser(u);
    	
    	
    	
    }
    public static void login() throws ClassNotFoundException, SQLException
    {
 
    	System.out.println("\n------------------------------------------\n");
    	System.out.println("Enter Username        :");
    	String username=d.next();
    	System.out.println("Enter Password        :");
    	String pass=d.next();
    	int select=0;
    	while(select==0) {
    		if(user.checkPass(username).equals(pass))
    		{
    			String email=user.email(username);
    			System.out.println();
    			System.out.println("\n=================================================\n");
    			System.out.println("\nEnter 1 to Explore Packages      :");
    			System.out.println("Enter 2 to Book Packages         :");
    			System.out.println("Enter 3 to Customize My Package  :");
    			System.out.println("Enter 4 to View Booking Details  :");
    			System.out.println("Enter 5 to Exit                  :");
    			System.out.println("\n=================================================\n");
    			
    			System.out.println("Enter Your Choice     :");
    			int choice=d.nextInt();
    			if(choice==1)
    			{
    				select=PackagesView.DefaultPackages();
    			}
    			else if(choice==2)
    			{
    				BookingView.BookPack();
    				select=0;
    			}
    			else if(choice==3)
    			{
    				CustomizeView.customize();
    				select=0;
    			}
    			else if(choice==4)
    			{
    				System.out.println("Enter 1 to View Default Booked Package Details  :");
    				System.out.println("Enter 2 to View Your Customized Package Details :");
    				int c=d.nextInt();
    				if(c==1)
    				{
    				ArrayList<Booking> al=Bookingdb.checkPacks(email);
    				for(int i=0;i<al.size();i++)
    				{
    					System.out.println("**********************************************************");
    					System.out.println("Package     : "+(i+1)+"\n");
    					
    					
    					System.out.println("PackageId    : "+al.get(i).getpackageId());
    					System.out.println("State        : "+al.get(i).getState());
    					System.out.println("No of days   : "+al.get(i).getNodays());
    					System.out.println("Date         : "+al.get(i).getDate());
    					System.out.println("Price perday : "+al.get(i).getPrice());
    					System.out.println("No Of People : "+al.get(i).getNoOfPeople());
    					if(al.get(i).getBookStatus().equals("1"))
    					{
    						System.out.println("Booking Status :Booked");
    					}
    					else if(al.get(i).getBookStatus().equals("0")||al.get(i).getBookStatus().equals("null"))
    					{
    						System.out.println("Booking Status :Booking Cancelled......");
    					}

    					System.out.println("**********************************************************");
    					
    				}
    				}
    				else if(c==2)
    				{
    					ArrayList<Customize> al=Customizedb.checkPacks(email);
        				for(int i=0;i<al.size();i++) {
    					System.out.println("\n**********************************************************\n");
    					System.out.println("Package     : "+(i+1)+"\n");
    					    					
    					System.out.println("State       : "+al.get(i).getState());
    					System.out.println("Cityname    : "+al.get(i).getCity());
    					System.out.println("Places      : "+al.get(i).getPlaces());
    					System.out.println("Transport   : "+al.get(i).getTransport());
    					System.out.println("Hotel       : "+al.get(i).getHotel());
    					System.out.println("No of days  : "+al.get(i).getDays());
    					System.out.println("Date        : "+al.get(i).getDate());
    					System.out.println("NoOfPeople  : "+al.get(i).getPeople());
    					if(al.get(i).getBookStatus().equals("1"))
    					{
    						System.out.println("Booking Status :Booked");
    					}
    					else if(al.get(i).getBookStatus().equals("0")||al.get(i).getBookStatus().equals("null"))
    					{
    						System.out.println("Booking Status :Booking Cancelled......");
    					}

    					System.out.println("\n**********************************************************\n");
    					}
    				}
    			}
    			else if(choice==5)
    			{
    				select=1;
    				System.out.println("Thanks For Visiting..............Logging out!....");
    			}
    			
    		}
    		else
    		{
    			System.out.println("Invalid Login Details.........Please Try Again.....");
    			break;
    		}
    	}
    }
}
