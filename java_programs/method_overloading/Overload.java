/* WAP to overload static and non-static method together, and call methods from main method*/

class Overload 
{
	public static void move(String z)
	{
		System.out.println("move towards "+z);

	}

	public void move(int k)
	{
		System.out.println("move up to km "+k);
	}

	public static void main(String[] args) 
	{
		move("south");
		Overload m1 = new Overload();
		m1.move(5);
	}
}
