/* WAP to perform subtraction using static method with 2 double arg's and
do not return the result, rather print the result in the same method,call the method
from main method*/

class Subtraction 
{
	public static void sub(double a, double b) 
	{
		System.out.println("In subtraction method");
		double c = a-b;
		System.out.println(c);
	}

	public static void main(String[] args)
	{
		System.out.println("Starts...");
		sub(5.6,2.3);
		System.out.println("Ends...");
	}
}
