package setInterface;
import java.util.*;

public class Product implements Comparable<Product>{
	String name,id;
	float price;
	int qty;
	public Product(String name, String id, float price, int qty) {
		this.name = name;
		this.id = id;
		this.price = price;
		this.qty = qty;
	}
	@Override
	public String toString() {
		return "Product [name=" + name + ", id=" + id +
				", price=" + price + ", qty=" + qty + "]";
	}
	public static Product newProduct(Scanner sc)
	{
		System.out.println("Enter Pname : ");
		String name = sc.nextLine();
		System.out.println("Enter Id: ");
		String id = sc.nextLine();
		System.out.println("Enter Price : ");
		float price = Float.parseFloat(sc.nextLine());
		System.out.println("Enter Qty: ");
		int qty = Integer.parseInt(sc.nextLine());
		
		return new Product(name, id, price, qty);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Hash\t2.Linked\t3.Tree :: ");
		
		Set<Product> ob = null;
		switch(Integer.parseInt(sc.nextLine()))
		{
		case 1:
			ob = new HashSet<Product>();
			break;
		case 2:
			ob = new LinkedHashSet<Product>();
			break;
		case 3:
			ob = new TreeSet<Product>();
			break;
		}
		
		
		while(true)
		{
			System.out.println("1.Insert new Data\t2.Display");
			switch(Integer.parseInt(sc.nextLine()))
			{
			case 1:
				ob.add(newProduct(sc));
				break;
			case 2:
				for(Product temp : ob)
				{
					System.out.println(temp.toString());
				}
				break;
			case 3:
				sc.close();
				System.exit(0);
			}
		}
	}
	@Override
	public int compareTo(Product o) {
		return this.id.compareTo(o.id);
	}
	
}
