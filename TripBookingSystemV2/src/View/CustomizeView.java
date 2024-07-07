package View;
import java.sql.SQLException;
import java.util.Scanner;
import Model.Customizedb;
import Controller.Customize;
public class CustomizeView {
	static Scanner d=new Scanner(System.in);
      static  Customizedb cus=new Customizedb();
      static Customize custom=new Customize();
	public static void customize() throws ClassNotFoundException, SQLException {
		Customize c=new Customize();
		System.out.println("----------------Customize Your Package-----------------");
		System.out.println("Enter Your Name         :");
		c.setName(d.next());
		System.out.println("Enter Your Email        :");
		c.setEmail(d.next());
		System.out.println("Enter Your Phonenumber  :");
		c.setPhonenumber(d.next());
		System.out.println("Enter State             :");
		c.setState(d.next());
		System.out.println("Enter CityName          :");
		c.setCity(d.next());
		System.out.println("Enter Places            :");
		c.setPlaces(d.nextLine());
		d.nextLine();
		System.out.println("Enter Transport (Bus,Train,Flight) :");
		c.setTransport(d.next());
		System.out.println("Enter HotelName         :");
		c.setHotel(d.next());
		System.out.println("Enter No of Days (max 15 Days)     :");
		c.setDays(d.next());
		System.out.println("Enter Date              :");
		c.setDate(d.next());
		System.out.println("Enter no of People      :");
		c.setPeople(d.next());
		
		if(c.getState().equals("Tamilnadu"))
		{
			System.out.println("\n*----Your Package is available----*");
			System.out.println("\nEnter 1 to Book   :");
			System.out.println("Enter 2 to Exit   :");
			System.out.println("\nEnter Your Choice :");
			int choice=d.nextInt();
			if(choice==1)
			{
				c.setBookStatus("1");
				System.out.println("\n*---------Your Package is Booked Successfully!---------*");
				System.out.println("Please Check Your mail for Payment Details! , Our Team will contact you within 30 mins.");
			}
			else if(choice==2)
			{
				c.setBookStatus("0");
				System.out.println("Thanks For Visiting........Have a Nice Day!");  
			}
			else
			{
				System.out.println("Invalid Choice.............Try Again!");
			}
		}
		else
		{
			System.out.println("Sorry Your Package is not available........We Take Customized Packages only inside 'Tamilnadu' .........");
		}
		cus.addCustom(c);
		
		

	}

}
