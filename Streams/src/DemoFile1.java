import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class DemoFile1 {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		try(sc;)
		{
			try {
				System.out.println("Enter source Location: ");
				FileInputStream fis = new FileInputStream(sc.nextLine());
				System.out.println("Enter Destination Location : ");
				FileOutputStream fos = new FileOutputStream(sc.nextLine());
				int k;
				while((k=fis.read())!=-1)
				{
					fos.write(k);
				}
				System.out.println("File Copied Successfully");
				fos.close();
				fis.close();
			}
			catch(FileNotFoundException e)
			{
				System.out.println("File not found");
			}
			catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
