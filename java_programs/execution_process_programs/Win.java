/* WAP to create static method with int arg and call the method 
from main method. Draw Execution diagram*/

class Win 
{
	public static void move(int a)
	{
		System.out.println("move towards north upto km " +a);
	}
	
	public static void main(String[] args) 
	{
		System.out.println("main starts...");
        move(2);
		System.out.println("main ends...");
	}
}
