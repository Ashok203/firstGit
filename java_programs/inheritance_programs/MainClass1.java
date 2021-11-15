class M
{
	public int i = 45;
}

class N extends M
{
	public double j = 4.5;
	public void display()
	{
		System.out.println(" From M inherited variable i :" +i);
		System.out.println("From N own variable j : " +j);
	}
}

class O extends M
{
	public double k = 2.5;
	public void info()
	{
		System.out.println(" From M inherited variable i :" +i);
		System.out.println("From N inherited variable k :" +k);
	}
}

class MainClass1
{
	public static void main(String[] args)
	{
		O o1 = new O();
		N n1 = new N();
		o1.info();
		n1.display();
	}
}
