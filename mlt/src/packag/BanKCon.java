package packag;

public class BanKCon 
{

	public synchronized void deposite(String aNo, double amt) 
	{
	     	for(User x: Storage.ulist)
	     	{
	     		if(x.getAccno().equals(aNo))
	     		{
	     			x.setBalance(x.getBalance()+amt);
	     			Tran t=new Tran();
	     			t.setType("credit");
	     			t.setCurr_Bal(x.getBalance());
	     			x.getTran().add(t);
	     			
	     			System.out.println(x.getBalance());
	     		}
	     	}
	}
	public synchronized void Withdraw(String aNo,double amt) 
	{
		int j=0;
		for(User x: Storage.ulist)
     	{
     		if(x.getAccno().equals(aNo) && x.getBalance()>=amt)
     		{
     			x.setBalance(x.getBalance()-amt);
     			Tran t=new Tran();
     			t.setType("withdraw");
     			t.setCurr_Bal(x.getBalance());
     			x.getTran().add(t);
     			System.out.println(x.getBalance());
     			j++;
     		}
     	}
		if(j==0)
		{
			System.out.println("Invaid user name");
		}
	}
	public void checkBalance(String aNo) 
	{
		for(User x:Storage.ulist)
		{
			if(x.getAccno().equals(aNo))
			{
				System.out.println(x.getBalance());
			}
			
		}
		
	     	
	}
	public void transactionHistory(String aNo)
	{
		for(User x:Storage.ulist)
		{
			if(x.getAccno().equals(aNo))
			{
				for(Tran tr:x.getTran())
				{
					System.out.println(tr.getType()+"Date:"+tr.getDate()+""+"balance:"+tr.getCurr_Bal());
				}
			}
		}
	}
	
  }
