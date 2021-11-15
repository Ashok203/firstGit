/*WAP to 2 static methods and call from main method*/

class Demo 
{
	public static void read() 
	{
		System.out.println("read...");
	}

	public static void write()
	{
		System.out.println("write...");
	}


	public static void main(String args[])
	{
		System.out.println("start...");
		read();
		write();
		System.out.println("ends...");
	}
}
