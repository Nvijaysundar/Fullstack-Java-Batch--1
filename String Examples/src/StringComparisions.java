
public class StringComparisions {
	public static void main(String[] args) {
		String str = "Java",str2 = "Java",str3 = new String("JavA"),str4 = new String("Java");
		
		/*
		 * if(str == str2) System.out.println("Same"); else
		 * System.out.println("Not Same");
		 * 
		 * if(str3 == str4) System.out.println("Same"); else
		 * System.out.println("Not Same");
		 */	
		
		if(str.equalsIgnoreCase(str3))
			System.out.println("Same");
		else
			System.out.println("Not Same");
		
		System.out.println(str.compareTo(str3));
	}
}
