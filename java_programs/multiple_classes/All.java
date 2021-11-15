/* WAP to create static variable,static method, non-static variable,non-static method
and print variables, call methods from another class. */

class Allin1 
{
	public static  int a = 2;
	public static void walk()
	{
		System.out.println("walk for 2kms....");
	}
	public double b = 3.5;
	public void fly()
	{
		System.out.println("fly towards sky..");
	}
}
class All
{

	public static void main(String[] args) 
	{
		Allin1.walk();
		System.out.println(Allin1.a);
		Allin1 a1 = new Allin1();
		a1.fly();
		System.out.println(a1.b);

	}
}
