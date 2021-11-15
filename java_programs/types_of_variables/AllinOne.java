/* WAP to create 1 static variable, 1 non-static variable, 1 static method, 1 non-static method, create local variable
inside static method and non-static method and print local variable, print gobal variable in main method, and call methods from main method */

class AllinOne  
{
	public static int i = 89;  /*gobal variable*/
	public double j = 12.3;

	public static void fire()
	{
		int y = 23; /*local variable*/
		System.out.println(y);
	}

	public void swim()
	{
		boolean z = true;
		System.out.println(z);
	}
	public static void main(String[] args) 
	{
		System.out.println(i);
		AllinOne a1 = new AllinOne();
		System.out.println(a1.j);
		fire();
		a1.swim();
	}
}
