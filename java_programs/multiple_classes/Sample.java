class Demo 
{

	public static int a = 23;
	public double b = 1.5;
}

class Sample
{
	public static void main(String[] args) 
	{
		System.out.println(Demo.a);
		Demo d1 = new Demo();
		System.out.println(d1.b);
	}
}
