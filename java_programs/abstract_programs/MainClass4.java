/* write program for
  1.Hierarchical Inheritance.
  2.Define single abstract method.
  3.Implement the method.
  4.Create MainClass , main method and call the method.*/


abstract class Run1
{
	abstract public void walk();
}

class Demo1 extends Run1
{
	public void walk()
	{
		System.out.println("walk 6kms...");
	}
}

class Demo2 extends Run1
{
	public void walk()
	{
		System.out.println("walk 10kms....");
	}
}

class MainClass4
{
	public static void main(String[] args)
	{
		Demo1 d1 = new Demo1();
		Demo2 d2 = new Demo2();
		d1.walk();
		d2.walk();
	}
}