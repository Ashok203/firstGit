class Demo 
{
	Demo()
	{
		System.out.println("In Demo class constructor....");
	}
	Demo(int i)
	{
		System.out.println("In Demo class int arg constructor...");
	}
	Demo(int i,double j)
	{
		System.out.println("In Demo class int, double arg constructor...");
	}
	Demo(String z)
	{
		System.out.println("In Demo class String arg constructor...");
	}
	public static void main(String[] args) 
	{
		Demo d1 = new Demo("hi");
		Demo d2 = new Demo(99);
		Demo d3 = new Demo(12,1.3);
		Demo d4 = new Demo();
	}
}
