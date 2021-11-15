/* WAP to create static method with double and int argument, non-static method with char, String, boolean arg , print all the argument, call all the method from main method */

class  SimpleProgram
{
	public static void test(double a,int b) 
	{
		System.out.println("Inside test method");
		System.out.println(a);
		System.out.println(b);
	}

	public  void move(char m,String n,boolean l)
	{
		System.out.println("Inside move method");
		System.out.println(m);
		System.out.println(n);
		System.out.println(l);
	}
	public static void main(String[] args)
	{
		System.out.println("Starts..");
		test(5.6,45);
		SimpleProgram t1 = new SimpleProgram();
		t1.move('#',"Ashok",true);
		System.out.println("Ends..");
	}
}
