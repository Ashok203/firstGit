abstract class Demo2
{
	public void walk1()
	{
		System.out.println("walk 5kms....");
	}
	abstract public void walk2();
}

class Sample2 extends Demo2
{
	
	public void walk2()
	{
		System.out.println("walk 10kms...");
	}
}

class MainClass2
{
	public static void main(String[] args)
	{
		Sample2 s2 = new Sample2();
		s2.walk1();
		s2.walk2();
	}
}