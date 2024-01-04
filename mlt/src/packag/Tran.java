package packag;

import java.util.Date;

public class Tran 
{
	private Date date;
	private String type;
	private double curr_balance;
	
	public Date getDate()
	{
		return date;
	}
	
	public Tran()
	{
		this.date= new Date();
	}
	
	public void setDate(Date date)
	{
		this.date=date;
	}
	
	public String getType()
	{
		return type;
	}
	
	public void setType(String type)
	{
		this.type=type;
	}
	
	public double getCurr_Bal()
	{
		return curr_balance;
	}
	 public void setCurr_Bal(double curr_balance)
	 {
		 this.curr_balance= curr_balance;
	 }
}
