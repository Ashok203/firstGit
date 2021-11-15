class Run 
{
	public static int y = 89;
	public void walk()
	{
		System.out.println(y);/*direct access*/
	}
	public static void main(String[] args) 
	{
		Run r1 = new Run();
		Run r2 = new Run();
		Run r3 = new Run();
		r1.walk();
		r2.walk();
		r3.walk();
	}
}


/* Direct access: Because static variable only single copy, that's why it allows direct access*/