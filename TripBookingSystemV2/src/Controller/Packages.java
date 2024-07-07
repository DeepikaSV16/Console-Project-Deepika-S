package Controller;
import java.sql.SQLException;
import java.util.ArrayList;

import Model.Packagesdb;

public class Packages {
    private String State;
    private String Cityname;
    private String Places;
    private String Transport;
    private String Hotel;
    private String Food;
    private String Days;
    private String Date;
    private String additionals;
    private String Price;
    private String PackId;
    public Packages()
    {
    	this.State="";
    	this.Cityname="";
    	this.Places="";
    	this.Transport="";
    	this.Hotel="";
    	this.Food="";
    	this.Days="";
    	this.Date="";
    	this.additionals="";
    	this.Price="";
    	this.PackId="";
    }
    public void setState(String State)
    {
    	this.State=State;
    }
    public String getState()
    {
    	return this.State;
    }
    public void setCityname(String Cityname)
    {
    	this.Cityname=Cityname;
    }
    public String getCityname()
    {
    	return this.Cityname;
    }
    public void setplaces(String Places)
    {
    	this.Places=Places;
    }
    public String getPlaces()
    {
    	return this.Places;
    }
    public void setTransport(String Transport)
    {
    	this.Transport=Transport;
    }
    public String getTransport()
    {
    	return this.Transport;
    }
    public void setHotel(String Hotel)
    {
    	this.Hotel=Hotel;
    }
    public String getHotel()
    {
    	return this.Hotel;
    }
    public void setFood(String Food)
    {
    	this.Food=Food;
    }
    public String getFood()
    {
    	return this.Food;
    }
    public void setDays(String Days)
    {
    	this.Days=Days;
    }
    public String getDays()
    {
    	return this.Days;
    }
    public void setDate(String Date)
    {
    	this.Date=Date;
    }
    public String getDate()
    {
    	return this.Date;
    }
    public void setAdditionals(String additionals)
    {
    	this.additionals=additionals;
    }
    public String getAdditionals()
    {
    	return this.additionals;
    }
    public void setPrice(String Price)
    {
    	this.Price=Price;
    }
    public String getPrice()
    {
    	return this.Price;
    }
    public void setPackId(String PackId)
    {
    	this.PackId=PackId;
    }
    public String getPackId()
    {
    	return this.PackId;
    }
    Packagesdb db=new Packagesdb();
    public ArrayList<Packages> getPack() throws ClassNotFoundException, SQLException
    {
    	return db.checkPacks();
    }
	
}
