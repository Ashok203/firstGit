class Demo 
{
	public static void test(int i,int j) 
	{
		System.out.println("Inside test method of int,int argument");
	}

	public static void test(int i,double j) 
	{
		System.out.println("Inside test method of int,double argument");
	}

	public static void test(double i,int j) 
	{
		System.out.println("Inside test method of double,int argument");
	}

	public static void test(int i,int j,int k) 
	{
		System.out.println("Inside test method of int,int,int argument");
	}

	public static void main(String[] args)
	{
		test(2,3);
		test(2,2.5);
		test(3.5,2);
		test(2,3,4);
	}
}
