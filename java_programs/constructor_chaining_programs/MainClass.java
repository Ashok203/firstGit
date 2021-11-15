class A
{
	A()
	{
		System.out.println("A class constructor without argument..");
	}
}

class B extends A
{
	B(double i)
	{
		super();
		System.out.println("B class constructor with double argument..");
	}
}
class MainClass
{
	public static void main(String[] args)
	{
		B b1 = new B(2.5);
	}
}