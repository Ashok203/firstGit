/* WAP to create a method for addition of 2 numbers and print the result in the method,
call the method from main method*/

class Addition 
{
	public static void add(int a,int b) 
	{
		System.out.println("In addition method...");
		int c = a+b;
		System.out.println(c);
	}

	public static void main(String[] args)
	{
		System.out.println("Starts...");
		add(5,6);
		System.out.println("Ends...");
	}
}
