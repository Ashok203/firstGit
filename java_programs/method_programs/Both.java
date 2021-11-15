/* WAP to create 1 static method and 1 non-static method and call from main method */

class Both 
{
	public static void walk() 
	{
		System.out.println("Walk toward south");
	}

	public void sit()
	{
		System.out.println("Sit on bench in the park");
	}

	public static void main(String[] args)
	{
		System.out.println("Starts...");
		walk();
		Both t1 = new Both();
		t1.sit();
		System.out.println("Ends...");
	}
}
