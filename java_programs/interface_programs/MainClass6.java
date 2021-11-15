interface Sample4
{
	public void run();
}

interface Sample5
{
	public void run1();
}

interface Sample6
{
	public void run2();
}

class Demo4 implements Sample4,Sample5,Sample6
{
	public void run()
	{
		System.out.println("run 5kms....");
	}

	public void run1()
	{
		System.out.println("run 10kms...");
	}

	public void run2()
	{
		System.out.println("run 15kms...");
	}
}
class MainClass6
{
	public static void main(String[] args)
	{
		Demo4 d4 = new Demo4();
		d4.run();
		d4.run1();
		d4.run2();
	}
}