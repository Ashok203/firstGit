class Demo 
{
	public static int a = 20;

	public static void test()
	{
		System.out.println(a);/* direct access*/
		System.out.println(Demo.a);/*through classname access*/
	}
	public static void main(String[] args) 
	{
		test();
	}
}


/* Direct access: Because static method and static variable are present in same static-pool area*/

/*Classname access: Because there is only single copy of static and it belongs whole class.Hence,access through classname*/