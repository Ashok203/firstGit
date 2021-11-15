interface Sample1
{
	public void walk1();
}

interface Sample2 extends Sample1
{
	public void walk2();
}

class Demo1 implements Sample2
{
	public void walk1()
	{
		System.out.println("walk south..");
	}

	public void walk2()
	{
		System.out.println("walk north..");
	}
}

class MainClass4
{
	public static void main(String[] args)
	{
		Demo1 d1 = new Demo1();
		d1.walk1();
		d1.walk2();
	}
}