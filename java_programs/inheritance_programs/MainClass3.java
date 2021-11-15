class U
{
	public static double z = 7.7;
	public int  a = 10;
}

class V extends U
{
	public int m = 99;
	public void show()
	{
		System.out.println("Shared U class is : "+z);
		System.out.println("Inheritance U class : "+a);
		System.out.println("own variable is : "+m);
	}
}

class W extends U
{
	public int n = 22;
	public void print()
	{
		System.out.println("shared u class is : "+z);
		System.out.println("Inheritance U class : "+a);
		System.out.println("own variable : "+n);
	}
}

class MainClass3
{
	public static void main(String[] args)
	{
		V v1 = new V();
		W w1 = new W();
		v1.show();
		w1.print();
	}
}