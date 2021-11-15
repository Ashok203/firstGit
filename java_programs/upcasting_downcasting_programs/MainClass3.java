/* WAP for abstract class and upcasting*/


abstract class Car
{
	abstract public void fly();
}

class Car1 extends Car
{
	public void fly()
	{
		System.out.println("fly like eagle...");
	}
}

class MainClass3
{
	public static void main(String[] args)
	{
		Car c1 = new Car1();
		c1.fly();
	}
}

/* Abstract class reference variable can be created, but object cannot be created*/