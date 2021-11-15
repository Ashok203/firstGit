/* Write a program for
   1. Multi-level inheritance
   2.Define 2 abstract methods in superclass
   3.Complete/Implement/Override one method in immediate subclass, other
     method in later subclass.
   4.Create MainClass and main method and call the methods.*/


abstract class Run
{
	abstract public void fly();
	abstract public void swim();
}

abstract class Demo1 extends Run
{
	public void fly()
	{
		System.out.println("fly into sky...");
	}
}

class Demo2 extends Demo1
{
	public void swim()
	{
		System.out.println("swim like fish...");
	}
}

class MainClass3
{
	public static void main(String[] args)
	{
		
		Demo2 d2 = new Demo2();
		d2.fly();
		d2.swim();
	}
}