package cursorstatements;

import java.util.ListIterator;
import java.util.Spliterator;
import java.util.Vector;

public class Example {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<>();
		for(int i=1;i<=10;i++)
			v.add(i);
		System.out.println(v.toString());
		
		ListIterator<Integer> it1 = v.listIterator();
		while(it1.hasNext())
		{
			System.out.println(it1.next());
		}
		while(it1.hasPrevious())
		{
			System.out.println(it1.previous());
		}
		System.out.println("Using Lambda Expression : ");
		Spliterator<Integer> sp = v.spliterator();
		sp.forEachRemaining((k)->{
			System.out.println(k);
		});
		
	}

}
