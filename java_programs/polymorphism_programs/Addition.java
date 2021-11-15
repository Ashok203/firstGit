class Addition
{
	public static void add(int a,int b)
	{
		System.out.println(a+b);
	}
	public static void add(double a,double b)
	{
		System.out.println(a+b);
	}
	public static void add(int a,double b)
	{
		System.out.println(a+b);
	}

	public static void main(String[] args)
	{
		add(3.4,7.8);
		add(9,1.2);
		add(4,5);
	}
}