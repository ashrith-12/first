package packag;
import java.util.ArrayList;
import java.util.List;


public class User 
{
	private String name;
	private String accno;
	private double balance;
	
	private List<Tran> tran;

	public User(String name, String accno)
	{
		this.name = name;
		this.accno = accno;
		this.balance = 0;
		this.tran = new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccno() {
		return accno;
	}

	public void setAccno(String accno) {
		this.accno = accno;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public List<Tran> getTran() {
		return tran;
	}

	public void setTran(List<Tran> tran) {
		this.tran = tran;
	}

}
