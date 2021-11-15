interface Run4
{
	public void get();
}

class Run5
{
	public void set()
	{
		System.out.println("set the fitting correct...");
	}
}

class Demo11 extends Run5 implements Run4
{
	public void get()
	{
		System.out.println("get new bike....");
	}
}

class MainClass9
{
	public static void main(String[] args)
	{
		Demo11 d11 = new Demo11();
		d11.set();
		d11.get();
	}
}