
public class Example1 {
	public static void main(String[] args) {
		String str = "Java Program",str3 = "  ";
		System.out.println("Leng : "+str.length());
		System.out.println(str3.isEmpty());
		System.out.println(str3.isBlank());
		System.out.println(str.charAt(5));
		System.out.println(str.startsWith("ava",1));
		System.out.println(str.endsWith("gram"));
		System.out.println(str.substring(6));
		System.out.println(str.substring(3,8));
		System.out.println(str.replace('a','k'));
		System.out.println(str.replaceFirst("av","ppp"));
		System.out.println(str.replaceAll("[aP]","kkk"));
		System.out.println(str.contains("ava"));
		System.out.println(str.toString());
		char ch[] = str.toCharArray();
		for(int i=0;i<ch.length;i++)
			System.out.print(ch[i]+" ");
		System.out.println();
		int i = 456;
		System.out.println(String.valueOf(i).concat("Hello"));
		
	}
}
