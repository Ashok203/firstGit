/* WAP to perform multiplication in 4 ways using method-overloading, 2 methods 
should not return o/p,rather print in the same method, other 2 methods should return
o/p and print those o/p in main method */

class Multiply 
{
	public static void mul(int a,int b) 
	{
		int c = a*b;
		System.out.println("Result of multiply is " +c);
	}

	public static void mul(double a,int b)
	{
		double d = a*b;
		System.out.println("Result of multiply is " +d);
	}

	public static double mul(double a,double b)
	{
		double e = a*b;
		return e;
	}

	public static double mul(int a,double b)
	{
		double f = a*b;
		return f;
	}

	public static void main(String[] args)
	{
		mul(2,5);
		mul(2.5,5);
		double e = mul(2.5,5.5);
		double f = mul(5,3.5);
		System.out.println("Result of multiply is " +e);
		System.out.println("Result of multiply is " +f);
		

	}
}
