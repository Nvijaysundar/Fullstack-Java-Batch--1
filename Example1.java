import java.util.Scanner;
class Example1{
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Name : ");
		String name = sc.nextLine();
		System.out.print("Enter Age:");
		int age =  Integer.parseInt(sc.nextLine());	
		System.out.print("Enter Desg : ");
		String Desg = sc.nextLine();	
		
		System.out.println("Name : "+name);
		System.out.println("Desg : "+Desg);
		System.out.println("Age : "+age);
		sc.close();
	}
}