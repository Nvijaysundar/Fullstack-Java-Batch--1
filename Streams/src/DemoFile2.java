import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class DemoFile2 {
	public static void main(String[] args) {
		try {
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
			FileWriter fw = new
					FileWriter("E:\\Java Full stack - Batch 1\\textnew.txt");
		char ch;
		System.out.println("Enter data to be inserted (@ to end)");
		while((ch=(char)br.read())!='@')
		{
			fw.write(ch);
		}
		br.close();
		fw.close();
		System.out.println("File Written Successfully");
		
		FileReader fr = new 
				FileReader("E:\\Java Full stack - Batch 1\\textnew.txt");
		int k;
		while((k=fr.read())!=-1)
		{
			System.out.print((char)k);
		}
		fr.close();
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
