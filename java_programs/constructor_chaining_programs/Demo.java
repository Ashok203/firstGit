class Demo 
{
	Demo()
	{
		System.out.println("In Demo class constructor....");
	}
	Demo(int i)
	{
		this();
		System.out.println("In Demo class int arg constructor...");
	}
	Demo(int i,double j)
	{
		this(9);
		System.out.println("In Demo class int, double arg constructor...");
	}
	Demo(String z)
	{
		this(99,1.3);
		System.out.println("In Demo class String arg constructor...");
	}
	public static void main(String[] args) 
	{
		Demo d1 = new Demo("hi");
	}
}
