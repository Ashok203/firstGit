/* WAP to overload main method with both static and non-static.*/

class BothStatic 
{
	public static void main(int a)
	{
		System.out.println("Execute static main method int a...");
	}

	public static void main(String[] args)
	{
		System.out.println("Starts the method of execution....");
		main(2);
		BothStatic b1 = new BothStatic();
			b1.main(2.5);
	}
	public void main(double b)
	{
		System.out.println("Execute non-static main method double z...");
	}
}
