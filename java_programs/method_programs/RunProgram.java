/* WAP to  create non-static method which will return 99, static method which will
return "Hello", call the method from main method, receive the o/p and print the o/p and print the o/p in main method*/

class  RunProgram
{
	public int sit()
	{
		System.out.println("Inside sit method");
		return 99;
	}
	public static String stand()
	{
		System.out.println("Inside stand method");
		return "Hello";
	}
	public static void main(String[] args)
	{
		System.out.println("Starts...");
		RunProgram rp = new RunProgram();
		int a = rp.sit();
		System.out.println(a);
		String s = stand();
		System.out.println(s);
		System.out.println("Ends...");
	}
}
