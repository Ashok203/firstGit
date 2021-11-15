class A
{
	public void move()
	{
		System.out.println("move 5km......");
	}
}

class B extends A
{
	public void move()
	{
		System.out.println("move 10km.....");
	}
}

class MainClass
{
	public static void main(String[] args)
	{
	B b1 = new B();
	b1.move();
	}
}