class Sample 
{
	public static int y = 99;
	public static double z = 12.4;

	public double m = 89.3;
	public char n = '*';


	public static void main(String[] args) 
	{
		System.out.println("main starts...");
		System.out.println(y);
		System.out.println(z);
		Sample s1 = new Sample();
		System.out.println(s1.m);
		System.out.println(s1.n);
		System.out.println("main ends...");
	}
}
