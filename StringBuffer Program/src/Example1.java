
public class Example1 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Java");
		System.out.println(sb.capacity());	
		System.out.println(sb.length());
		sb.append("1234567890");
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		sb.append("123456");
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		sb.append("0");
		System.out.println(sb.toString());
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		sb.reverse();
		System.out.println(sb.toString());	
	}
}

