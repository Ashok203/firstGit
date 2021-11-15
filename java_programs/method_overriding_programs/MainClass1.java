class Shape
{
	public void rotate()
	{
		System.out.println("rotate in clock-wise direction..");
	}
}

class Circle extends Shape
{

}

class Rectangle extends Shape
{
	public void rotate()
	{
	System.out.println("rotate in anti-clock-wise direction..");
	}
}

class Triangle extends Shape
{

}

class MainClass1
{
	public static void main(String[] args)
	{
		Circle c1 = new Circle();
		Rectangle r1 = new Rectangle();
		Triangle t1 = new Triangle();
		c1.rotate();
		r1.rotate();
		t1.rotate();
	}
}