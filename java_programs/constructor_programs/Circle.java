class Circle 
{
	public double piValue;
	public int radius;

	Circle(double pi,int r)
	{
		piValue = pi;
		radius = r;
	    
	}

	public void areaOfCircle()
	{
		double area = piValue*radius*radius;
		
		System.out.println("Area of the circle : "+area);
	}
	public static void main(String[] args) 
	{
		Circle c1 = new Circle(3.14,5);
		Circle c2 = new Circle(3.14,10);
		c2.areaOfCircle();
		c1.areaOfCircle();
	}
}
