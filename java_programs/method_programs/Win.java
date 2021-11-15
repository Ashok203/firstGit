/* WAP to create 2 non static methods and call from main method */

class Win 
{
	public static void main(String[] args) 
	{
		System.out.println("Start...");
		Win obje = new Win();
		obje.go();
		obje.down();
		System.out.println("Ends...");
	}

	public void go()
	{
		System.out.println("Go and take right");
	}

	public void down()
	{
		System.out.println("Down to up");
	}
}
