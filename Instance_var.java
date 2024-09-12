class Instance_var{
	static int b = 10;
	int a = 20;

	void m1()
	{
			
	}
	public static void main(String args[])
	{
		int c = 30;
		System.out.println(b);
		Instance_var ob = new Instance_var();
		System.out.println("ob : a-" + ob.a);
		Instance_var ob2 = new Instance_var();
		System.out.println("ob2 : a-" + ob2.a);
		ob2.a += 30;
		System.out.println("ob : a-" + ob.a);
		System.out.println("ob2 : a-" + ob2.a);
	}
}