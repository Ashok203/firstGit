/* Q1.WAP to create non-static method with return type and call the method 
from main method. Draw Execution diagram */

class Demo1 
{
	public int add(int a,int b)
	{
		int s = a+b;
		return s;
	}
	public static void main(String[] args) 
	{
		System.out.println("main starts...");
		Demo1 d1 = new Demo1();
	    int s = d1.add(5,3);
		System.out.println(s);
		System.out.println("main ends...");
	}
}
