class A 
{
	public int i = 99;
}

class B extends A
{
	public int j = 35;
	public void display()
	{
		System.out.println(i);
		System.out.println(j);
	}
}

class MainClass
{
	public static void main(String[] args) 
		{
		B b1 = new B();
		b1.display();
	}
}
