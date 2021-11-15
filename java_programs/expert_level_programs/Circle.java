class Circle 
{
	public static double pi = 3.14;
	public int r;

	Circle(int r)
	{
		this.r = r;
	}

	public void findArea()
	{
		double area = pi*this.r*this.r;
		System.out.println("Area of circle is : "+area);
	}
	public static void main(String[] args) 
	{
		Circle c1 = new Circle(7);
		Circle c2 = new Circle(4);
		c1.findArea();
		c2.findArea();
	}
}
