class M
{
	M(String z)
	{
		System.out.println("In M String arg constructor...");
	}
}

class N extends M
{
	N(int i)
	{
		super("hi");
		System.out.println("In N int arg constructor...");
	}
}

class MainClass1
{
	public static void main(String[] args)
	{
		N n1 = new N(9);
	}
}