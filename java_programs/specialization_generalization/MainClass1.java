class Shape
{
	public void rotate()
	{
		System.out.println("rotate clock-wise");
	}
}

class Circle extends Shape
{
	public void findArea()
	{
		System.out.println("Area of circle...");
	}
}

class Rect extends Shape
{
	public void getArea()
	{
		System.out.println("Area of rect...");
	}
}

class Tri extends Shape
{
	public void printArea()
	{
		System.out.println("Area of tri...");
	}
}
/* Specialization program */

class MainClass1
{
	public static void main(String[] args)
	{
		display(new Circle());
		info(new Rect());
		print(new Tri());
	}

/* display method is specialized to Circle type object */

	public static void display(Circle c1)
	{
		System.out.println("-------Circle properties--------");
		c1.rotate();
		c1.findArea();
	}
/* info method is specialized to Rect type object */
	public static void info(Rect r1)
	{
		System.out.println("-------Rect properties----------");
		r1.rotate();
		r1.getArea();
	}

/*print method is specialized to Tri type object */
	public static void print(Tri t1)
	{
		System.out.println("-------Tri properties-----------");
		t1.rotate();
		t1.printArea();
	}
}