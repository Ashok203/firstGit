class P 
{
	public double a = 2.5;
}

class Q extends P
{
	public double b = 3.5;
}

class R extends Q
{
	public int c = 20;

	public void show()
	{
		System.out.println(" P class inherited property is a :" +a);
		System.out.println(" Q class inherited property is b :" +b);
		System.out.println(" R class own property is c :" +c);
	}
}

class MainClass2
{
	public static void main(String[] args)
	{
		R r1 = new R();
		
		r1.show();
		

	}
}
