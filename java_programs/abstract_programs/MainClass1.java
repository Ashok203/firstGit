abstract class Demo1
{
	abstract public void move1();
	abstract public void move2();
}

class Sample1 extends Demo1
{
	public void move1()
	{
		System.out.println("move west...");
	}
	public void move2()
	{
		System.out.println("move east...");
	}
}

class MainClass1
{
	public static void main(String[] args)
	{
		Sample1 s1 = new Sample1();
		s1.move1();
		s1.move2();
	}
}