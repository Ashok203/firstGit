/* WAP for interface and upcasting*/

interface Shape
{
	public void rotate();
}

class Circle implements Shape 
{
	public void rotate()
	{
		System.out.println("rotate in clockwise direction..");
	}
}

class MainClass4
{
	public static void main(String[] args)
	{
		Shape s1 = new Circle();
		s1.rotate();
	}
}

/* We can create reference variable for interface, but not object of interface*/