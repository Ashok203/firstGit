class Run 
{
	public static double i = 3.4;
	public int j = 67;
	public static void main(String[] args) 
	{
		System.out.println("main starts...");
		System.out.println(i);
        Run r1 = new Run();
		Run r2 = new Run();
		Run r3 = new Run();
		System.out.println(r1.j);
		System.out.println(r2.j);
		System.out.println(r3.j);
		System.out.println("main ends...");
	}
}
