interface Run1
{
	public void walk();
}

abstract class Run2
{
	abstract public void sit();
}

class Demo9 extends Run2 implements Run1
{
	public void walk()
	{
		System.out.println("walk towards east...");
	}

	public void sit()
	{
		System.out.println("sit on the table...");
	}
}

class MainClass8
{
	public static void main(String[] args)
	{
		Demo9 d9 = new Demo9();
		d9.walk();
		d9.sit();
	}
}