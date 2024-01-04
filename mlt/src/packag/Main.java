package packag;

public class Main extends Thread
{
	
	public static void main(String args[]) throws InterruptedException
	{
		//adding user
		User u1 = new User("Asrith", "12345");
		User u2 = new User("Aakash", "6789");
		Storage.ulist.add(u1);
		Storage.ulist.add(u2);
		
		
		BanKCon bk= new BanKCon();
		
		
		Thread t1 = new Thread()
		{
		  public void run() {
			  bk.deposite("6789", 3000);
			  bk.Withdraw("6789", 500);
			  bk.checkBalance("6789");
		  }
		};
		
		Thread t2 = new Thread()
		{
		  public void run() {
			  bk.deposite("6789", 1000);
			  bk.Withdraw("6789", 2000);
			  bk.checkBalance("6789");
		  }
		};
		
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		
	}

}
