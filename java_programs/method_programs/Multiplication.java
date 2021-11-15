/* WAP to perform multiplication of 2 int's with non-static method, return the result,
call the method from main method and print it in main method*/

class Multiplication 
{
	public int mul(int a,int b)
	{
		int c = a*b;
		return c;
	}

	public static void main(String[] args)
	{
		Multiplication m1 = new Multiplication();
		int c = m1.mul(5,2);
		System.out.println(c);
	}
}
