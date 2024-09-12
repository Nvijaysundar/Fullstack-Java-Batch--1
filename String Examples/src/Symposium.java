import java.util.Scanner;

public class Symposium {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		while(true)
		{
			System.out.print("1.Dept\t2.Roll\t3.Exit :: ");
			switch(Integer.parseInt(sc.nextLine()))
			{
			case 1:
				deptselect();
				break;
			case 2:
				deptbyroll();
				break;
			case 3:
				sc.close();
				System.exit(0);
			}
		}		
	}
	
	private static void deptselect()
	{
		System.out.println("1.CSE\t2.ECE\t3.EEE\t4.Mech\t5.Civ");
		switch(Integer.parseInt(sc.nextLine()))
		{
		case 1:
			cse();
			break;
		case 2:
			ece();
			break;
		case 3:
			eee();
			break;
		case 4:
			mech();
			break;
		case 5:
			civ();
			break;
		default : 
			System.out.println("Invalid Dept Selection");
		}
	}
	
	private static void deptbyroll() {
		System.out.print("Enter Your Roll : ");
		switch(sc.nextLine().substring(6, 8))
		{
		case "01":
			civ();
			break;
		case "02":
			eee();
			break;
		case "03":
			mech();
			break;
		case "04":
			ece();
			break;
		case "05":
			cse();
			break;
		default: 
			System.out.println("Invalid Roll Number");
		}
	}


	static void cse()
	{
		System.out.println("1.Cyber\t2.IOT");
		switch(Integer.parseInt(sc.nextLine()))
		{
		case 1:
			System.out.println("Room no : 12");
			break;
		case 2:
			System.out.println("Room no : 13");
			break;
		default:
			System.out.println("Invalid Event Selection");
		}
	}
	static void ece()
	{
		
	}
	static void mech() {
		
	}
	static void eee() {
		
	}
	static void civ() {
		
	}
	
}
