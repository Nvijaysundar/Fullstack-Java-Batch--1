import java.util.StringTokenizer;

public class Example1 {
	public static void main(String[] args) {
		String str = "Hi I'm Alpha. I'm learning java programming";
		StringTokenizer st = new StringTokenizer(str,"'");
		System.out.println(st.countTokens());
		System.out.println(st.nextToken());
		System.out.println(st.countTokens());
	}
}
