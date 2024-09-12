import java.util.HashMap;
import java.util.Scanner;

public class Theather {
	public static void main(String[] args) {
		Movie ss = new Movie();
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("1.Am\t2.Pm\t :: ");
			switch(Integer.parseInt(sc.nextLine()))
			{
			case 1:
				//am
				booktickets(ss.getAm(),sc);
				break;
			case 2:
				booktickets(ss.getPm(),sc);
				break;
			case 3:
				sc.close();
				System.exit(0);
			}
		}
	}

	private static void booktickets(HashMap<Integer, 
			HashMap<Integer, Integer>> show, Scanner sc) {
		if(checkAvailability(show))
		{
			displaySeats(show);
			ticketBooking(show,sc);
		}
		else
			System.out.println("Show is Completely Booked");
	}

	private static void ticketBooking(HashMap<Integer, 
			HashMap<Integer, Integer>> show, Scanner sc) {
		System.out.println("Enter Row: ");
		int row = Integer.parseInt(sc.nextLine());
		System.out.println("Enter Col: ");
		int col = Integer.parseInt(sc.nextLine());
		if(show.get(row).get(col)==0)
		{
			show.get(row).put(col,1);
			if(row == 1 || row == 2)
				System.out.println("Cost : 150/-");
			else if (row == 3)
				System.out.println("Cost : 100/-");
		}
		else
			System.out.println("Selected Seat not Available");
	}

	private static void displaySeats(HashMap<Integer, 
			HashMap<Integer, Integer>> show) {
		System.out.println("  1 2 3 4 5");
		for(int i=1;i<=3;i++)
		{
			System.out.print(i+" ");
			for(int j=1;j<=5;j++)
			{
				System.out.print(show.get(i).get(j)+" ");
			}
			System.out.println();
		}
	}

	private static boolean checkAvailability(HashMap<Integer,
			HashMap<Integer, Integer>> show) {
		for(int i=1;i<=3;i++)
		{
			if(show.get(i).containsValue(0))
				return true;
		}
		return false;
	}
}
