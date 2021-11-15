class Circle 
{
	public static double pi = 3.14;
	public int r;

	public void findArea()
	{
		double area = pi*r*r;
		System.out.println("Area of the circle is: "+area);
	}
	public static void main(String[] args) 
	{
		Circle c1 = new Circle();
		Circle c2 = new Circle();
		Circle c3 = new Circle();
		c1.r = 2;
		c2.r = 4;
		c3.r = 8;
		c1.findArea();
		c2.findArea();
		c3.findArea();
	}
}
