class Run 
{
	public static void main(String[] args) 
	{
		System.out.println("Start...");
		Run obj = new Run(); /* object creation*/
		obj.move(); /* non static method calling jvm for execution*/
	}
	public void move()
	{
		System.out.println("Move 5 km");
	}
}
