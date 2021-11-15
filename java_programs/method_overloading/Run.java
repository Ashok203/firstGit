/* WAP to overload main method */

class Run 
{
	public static void main(String[] args) 
	{
		System.out.println("execute main string...");
		main(5);
	}

	public static void main(int a)
	{
		System.out.println("execute main int method....");
	}
}
