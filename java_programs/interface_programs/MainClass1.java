interface Sample
{
	public void test();
}

class Demo implements Sample
{
	public void test()
	{
		System.out.println("test car...");
	}
}

class MainClass1
{
	public static void main(String[] args)
	{
		Demo d1 = new Demo();
		d1.test();
	}
}
