/* WAP to create static method , non-static method and
call it from another class. */

class Run 
{
	public static void move()
	{
		System.out.println("move to the right..");
	}
	public void fly()
	{
		System.out.println("fly like a bird..");
	}
}
class Run2
{		
	public static void main(String[] args) 
	{
		Run.move();
		Run r1 = new Run();
		r1.fly();
	}
}
