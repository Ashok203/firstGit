/* WAP to create 1 static variable and 1 non-static variable and print in main method */

class Demo 
{
	public static int a = 203;
	public double d = 5.6;
	public static void main(String[] args) 
	{
		System.out.println(a);
		Demo d1 = new Demo();
		System.out.println(d1.d);
	}
}
