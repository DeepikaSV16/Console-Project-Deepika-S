package Controller;
import View.CustomizeView;
import Model.Customizedb;

public class Customize {

	private String Name;
	private String EMail;
	private String Phonenumber;
	private String State;
	private String City;
	private String Places;
	private String Transport;
	private String Hotel;
	private String Days;
	private String Date;
	private String People;
	private String BookStatus;
	public Customize()
	{
		this.Name="";
		this.EMail="";
		this.Phonenumber="";
		this.State="";
		this.City="";
		this.Places="";
		this.Transport="";
		this.Hotel="";
		this.Days="";
		this.Date="";
		this.People="";
		this.BookStatus="";
	}
	public void setName(String Name)
	{
		this.Name=Name;
	}
	public String getName()
	{
		return this.Name;
	}
	public void setEmail(String EMail)
	{
		this.EMail=EMail;
	}
	public String getEmail()
	{
		return this.EMail;
	}
	public void setPhonenumber(String Phonenumber)
	{
		this.Phonenumber=Phonenumber;
	}
	public String getPhonenumber()
	{
		return this.Phonenumber;
	}
	public void setState(String State)
	{
		this.State=State;
	}
	public String getState()
	{
		return this.State;
	}
	public void setCity(String City)
	{
		this.City=City;
	}
	public String getCity()
	{
		return this.City;
	}
	public void setPlaces(String Places)
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
	public void setPeople(String People)
	{
		this.People=People;
	}
	public String getPeople()
	{
		return this.People;
	}
	public void setBookStatus(String BookStatus)
	{
		this.BookStatus=BookStatus;
	}
	public String getBookStatus()
	{
		return this.BookStatus;
	}
	
	
}
