import java.util.StringJoiner;

public class Example1 {
	public static void main(String[] args) {
		StringJoiner sj = new StringJoiner("/"),sj2 = new StringJoiner("-");
		sj.add("08");
		System.out.println(sj.toString());
		sj.add("08");
		System.out.println(sj.toString());
		sj2.setEmptyValue("sj2 object data is empty");
		System.out.println(sj2.toString());
		sj2.add("Hello");
		System.out.println(sj2.toString());
		sj.merge(sj2);
		System.out.println(sj.toString());
		System.out.println(sj2.toString());
		System.out.println(sj.length());
	}
}
