package listinterface;

import java.util.LinkedList;

public class Example11 {
	public static void main(String[] args) {
		LinkedList<Integer> al = new LinkedList<Integer>();	
		al.add(89);
		al.add(85);
		al.add(44);
		al.add(85);
		al.add(36);
		al.add(87);
		al.add(22);
		al.add(85);
		System.out.println(al.toString());
		
		al.set(1,1234);
		System.out.println(al.toString());
		al.add(1, 4321);
		System.out.println(al.toString());
		al.remove(new Integer(85));
		System.out.println(al.toString());
		
		
		LinkedList<Integer> al2 = new LinkedList<Integer>();
		al2.add(85);
		al2.add(36);
		al2.add(22);
		System.out.println(al.containsAll(al2));
	}
}
