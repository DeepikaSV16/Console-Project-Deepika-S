package Controller;

public class Booking {
 private String Name;
 private String Email;
 private String Phonenumber;
 private String packageId;
 private String State;
 private String Nodays;
 private String Date;
 private String Price;
 private String NoOfPeople;
 private String BookStatus;
   public Booking()
   {
	   this.Name="";
	   this.Email="";
	   this.Phonenumber="";
	   this.packageId="";
	   this.State="";
	   this.Nodays="";
	   this.Date="";
	   this.Price="";
	   this.NoOfPeople="";
	   this.BookStatus="";
   }
   public void setName(String Name)
   {
	   this.Name=Name;
   }
   public String getname()
   {
	   return this.Name;
   }
   public void setEmail(String Email)
   {
	   this.Email=Email;
   }
   public String getEmail()
   {
	   return this.Email;
   }
   public void setPhonenumber(String Phonenumber)
   {
	   this.Phonenumber=Phonenumber;
   }
   public String getPhonenumber()
   {
	   return this.Phonenumber;
   }
   public void setpackageId(String packageId)
   {
	   this.packageId=packageId;
   }
   public String getpackageId()
   {
	   return packageId;
   }
   public void setState(String State)
   {
	   this.State=State;
   }
   public String getState()
   {
	   return this.State;
   }
   public void setNodays(String Nodays)
   {
	   this.Nodays=Nodays;
   }
   public String getNodays()
   {
	   return this.Nodays;
   }
   public void setDate(String Date)
   {
	   this.Date=Date;
   }
   public String getDate()
   {
	   return this.Date;
   }
   public void setPrice(String Price)
   {
	   this.Price=Price;
   }
   public String getPrice()
   {
	   return this.Price;
   }
   public void setBookStatus(String BookStatus)
   {
	   this.BookStatus=BookStatus;
   }
   public String getBookStatus()
   {
	   return this.BookStatus;
   }
   public void setNoOfPeople(String NoOfPeople)
   {
	   this.NoOfPeople=NoOfPeople;
   }
   public String getNoOfPeople()
   {
	   return this.NoOfPeople;
   }

}
