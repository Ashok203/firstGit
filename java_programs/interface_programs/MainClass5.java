interface Sample1
{
	public void walk1();
}

class Demo1 implements Sample1
{
	public void walk1()
	{
		System.out.println("walk east..");
	}
}

class Demo2 implements Sample1
{
	public void walk1()
	{
		System.out.println("walk west..");
	}
}

class Demo3 implements Sample1
{
	public void walk1()
	{
		System.out.println("walk south..");
	}
}

class MainClass5
{
	public static void main(String[] args)
	{
		Demo1 d1 = new Demo1();
		Demo2 d2 = new Demo2();
		Demo3 d3 = new Demo3();
		d1.walk1();
		d2.walk1();
		d3.walk1();
	}
}