interface Sample1
{
	public void move1();
	public void move2();
}

class Demo2 implements Sample1
{
	public void move1()
	{
		System.out.println("move south");
	}

	public void move2()
	{
		System.out.println("move west");
	}
}

class MainClass3
{
	public static void main(String[] args)
	{
		Demo2 d2 = new Demo2();
		d2.move1();
		d2.move2();
	}
}