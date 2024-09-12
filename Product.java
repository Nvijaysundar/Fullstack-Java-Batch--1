class Product{
	String name,id;
	int qty;
	float price;
	Product(String name,String id,int qty,float price){
		this.name = name;
		this.id = id;
		this.qty = qty;
		this.price = price;
	}
	void getDetails()
	{
		System.out.println(name +"\t"+id +"\t" +qty +"\t" +price);
	}
	public static void main(String args[])
	{	
		Product p1 = new Product("Acer","A12",56,48675.36f);
		Product p2 = new Product("Hp","A13",89,75653.12f);
		p2.getDetails();
	}
}