import java.util.Scanner;

class BankAccount{
	String name;
	double balance;
	public BankAccount(String name, double balance) {
		this.name = name;
		this.balance = balance;
	}
	void deposit(double amount)
	{
		if(amount>0)
			this.balance += amount;
		else
			System.out.println("Amount should be +Ve");
	}
	void withdraw(double amount)
	{
		if(amount >0)
		{
			if(amount<=this.balance)
				this.balance -= amount;
			else
				System.out.println("Insuffcient funds");
		}
		else
			System.out.println("Amount should be +ve");
	}
	
	double checkbal()
	{
		return this.balance;
	}
	
}
public class Bank {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Account Holder NAme : ");
		String name = sc.nextLine();
		System.out.println("Enter Account Bal: ");
		double bal = Double.parseDouble(sc.nextLine());
		BankAccount b1 = new BankAccount(name,bal);
		
		while(true)
		{
			System.out.println("1.Dep\2.Wit\t3.bal\n4.exit");
			switch(Integer.parseInt(sc.nextLine()))
			{
			case 1:
				System.out.println("Enter Amount : ");
				b1.deposit(Double.parseDouble(sc.nextLine()));
				break;
			case 2:
				System.out.println("Enter Amount : ");
				b1.withdraw(Double.parseDouble(sc.nextLine()));
				break;
			case 3:
				System.out.println("Bal Available: "+b1.checkbal());
				break;
			case 4:
				sc.close();
				System.exit(0);
			}
		}
	}
}
