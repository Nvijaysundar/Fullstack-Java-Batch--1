import java.util.Scanner;

class Event{
	private String name;
	private int roomNumber;
	public Event(String name,int roomNumber)
	{
		this.name = name;
		this.roomNumber = roomNumber;
	}
	public String getName()
	{
		return this.name;
	}
	public int getRoomNumber()
	{
		return this.roomNumber;
	}
	
	public String toString()
	{
		return this.name+"\t"+this.roomNumber;
	}
}

class Department{
	private String name;
	private Event event1,event2;
	public Department(String name, Event event1, Event event2) {
		this.name = name;
		this.event1 = event1;
		this.event2 = event2;
	}
	
	public String getName()
	{
		return this.name;
	}
	public Event getEvent1()
	{
		return this.event1;
	}
	public Event getEvent2()
	{
		return this.event2;
	}
	
	public void displayEvent()
	{
		System.out.println("1 :"+this.event1.toString());
		System.out.println("2 : "+this.event2.toString());
	}
}

/*
 * class Student{ private String name,roll;
 * 
 * public Student(String name, String roll) { this.name = name; this.roll =
 * roll; }
 * 
 * public String getRoll() { return this.roll; } public String getName() {
 * return this.name; }
 * 
 * public String getDepartmentCode() { return this.roll.substring(6, 8); } }
 */


public class SymposiumUsingClasses {
	private static Scanner sc = new Scanner(System.in);
	private static final Department cse = new Department("CSE",
			new Event("DataScience",121),new Event("Raspberry PI",156));
	private static final Department ece = new Department("CSE",
			new Event("DataScience",121),new Event("Raspberry PI",156));
	private static final Department mech = new Department("CSE",
			new Event("DataScience",121),new Event("Raspberry PI",156));
	private static final Department eee = new Department("CSE",
			new Event("DataScience",121),new Event("Raspberry PI",156));
	private static final Department civ = new Department("CSE",
			new Event("DataScience",121),new Event("Raspberry PI",156));
	
	public static void main(String[] args) {
		while(true)
		{
			System.out.println("1.Registerbydept\n2.RegisterbyRoll\n3.exit:: ");
			switch(Integer.parseInt(sc.nextLine()))
			{
			case 1:
				selectDepatment();
				break;
			case 2:
				registerbyRoll();
				break;
			case 3:
				System.out.println("Thankyou...!");
				sc.close();
				System.exit(0);
			}
		}
	}

	private static void registerbyRoll() {
		System.out.println("Enter Your Roll : ");
		String roll = sc.nextLine();
		if(roll.length()==10)
		{
			switch(roll.substring(6, 8))
			{
			case "01":
				selectEvent(civ);
				break;
			case "02":
				selectEvent(eee);
				break;
			case "03":
				selectEvent(mech);
				break;
			case "04":
				selectEvent(ece);
				break;
			case "05":
				selectEvent(cse);
				break;
			default:
				System.out.println("Invalid Roll Number");
			}
		}
		else
			System.out.println("Invalid Roll Number");
		
	}

	private static void selectDepatment() {
		System.out.println("1.CSE\n2.ECE\n3.MECH\n4.EEE\n5.CIV :: ");
		switch(Integer.parseInt(sc.nextLine()))
		{
		case 1:
			selectEvent(cse);
			break;
		case 2:
			selectEvent(ece);
			break;
		case 3:
			selectEvent(mech);
			break;
		case 4:
			selectEvent(eee);
			break;
		case 5:
			selectEvent(civ);
			break;
		}
	}

	private static void selectEvent(Department dept) {
		
		dept.displayEvent();
		switch(Integer.parseInt(sc.nextLine()))
		{
		case 1 :
			System.out.println(dept.getEvent1().getName()+"\t"+dept.getEvent1().getRoomNumber());
			break;
		case 2:
			System.out.println(dept.getEvent2().getName()+"\t"+dept.getEvent2().getRoomNumber());
			break;
		}
	}

}
