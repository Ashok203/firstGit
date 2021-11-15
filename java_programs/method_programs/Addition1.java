class Addition1 
{
	public static double add(int a,double b) 
	{
		double c= a+b;
		return c;
	}

	public static void main(String[] args)
	{
		System.out.println("Starts...");

		double res= add(5,1.3);

		System.out.println(res);
		System.out.println("Ends...");
	}
}
