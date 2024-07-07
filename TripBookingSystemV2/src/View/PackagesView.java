package View;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import Controller.Packages;
import Model.Packagesdb;

public class PackagesView {
	static Scanner d=new Scanner(System.in);
	static Packagesdb packs=new Packagesdb();
     static Packages pk=new Packages();
	public static int DefaultPackages() throws ClassNotFoundException, SQLException 
	{
		ArrayList<Packages> al=pk.getPack();
		int i=0;
		while(i<al.size())
		{
			
			
			System.out.println("\n**********************************************************\n");
			System.out.println("Package     : "+(i+1)+"\n");
			Packages a=al.get(i);
			
			System.out.println("State       : "+a.getState());
			System.out.println("Cityname    : "+a.getCityname());
			System.out.println("Places      : "+a.getPlaces());
			System.out.println("Transport   : "+a.getTransport());
			System.out.println("Hotel       : "+a.getHotel());
			System.out.println("Food        : "+a.getFood());
			System.out.println("No of days  : "+a.getDays());
			System.out.println("Date        : "+a.getDate());
			System.out.println("Additionals : "+a.getAdditionals());
			System.out.println("Price       : "+a.getPrice());
			System.out.println("PackId      : "+a.getPackId());
			System.out.println("\n**********************************************************\n");
			i++;
			
		}
		return 0;
	}
}
