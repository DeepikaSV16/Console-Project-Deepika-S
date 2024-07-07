package View;
import Model.Bookingdb;
import View.PackagesView;
import Controller.Booking;

import java.sql.SQLException;
import java.util.Scanner;

public class BookingView {
	  static Bookingdb bookdb=new Bookingdb();
	  static Booking book=new Booking();
     static Scanner d=new Scanner(System.in);
	public static void BookPack() throws NumberFormatException, ClassNotFoundException, SQLException  {
		
		Booking b=new Booking();
		System.out.println("\n----------------Book Your Package---------------\n");
		System.out.println("Enter Your name        :  ");
		b.setName(d.next());
		System.out.println("Enter Your Emailid     :  ");
		b.setEmail(d.next());
		System.out.println("Enter Your Phonenumber :  ");
		b.setPhonenumber(d.next()); 
		System.out.println("Enter PackageId        :  ");
		b.setpackageId(d.next());
		System.out.println("Enter State            :  ");
		b.setState(d.next());
		System.out.println("Enter No of Days       :  ");
		b.setNodays(d.next());
		System.out.println("Enter Date             :  ");
		b.setDate(d.next());
		System.out.println("Enter Price per day    :  ");
		b.setPrice(d.next());
		System.out.println("Enter No of People     :  ");
		b.setNoOfPeople(d.next());
		if(bookdb.checkPid(b.getpackageId()))
		{
//		book.addBooking(b);
		      b.setBookStatus("1");
		
			String days=b.getNodays();
			String people=b.getNoOfPeople();
            String price=b.getPrice();
            int Total=Integer.parseInt(days)*Integer.parseInt(price)*Integer.parseInt(people);
		System.out.println("---------------------------------------------------------------------------------------------");
		System.out.println("Total Amount of Your Trip is : Rs."+Total);
		System.out.println("\nYour Package Booked Successfully.......Please check Your Mail for Payment and Confirmation.");
		}
		else 
		{
			b.setBookStatus("0");
			System.out.print("\nPackage Id Does Not Exixts......Please enter Correct PackageId to Book Package!");
			System.out.println("\nEnter 1 to Book   :");
			System.out.println("Enter 2 Exit    :");
			int c=d.nextInt();
			if(c==1)
			{
				BookingView.BookPack();
			}
			else if(c==2)
			{
				System.out.println("Thanks For Visiting...........Have a Nice day!");
			}
		}
		bookdb.addBook(b);
		
	}

}
