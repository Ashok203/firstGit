class Rect 
{
	public double length;
	public double width;

	public void findArea()
	{
		double area = length*width;
		System.out.println("Area of the rectangle is :"+area);
	}
	public static void main(String[] args) 
	{
		Rect r1 = new Rect();
		Rect r2 = new Rect();
		r1.length = 5.6;
		r1.width = 2.5;
		r2.length = 4.5;
		r2.width = 2.3;
		r1.findArea();
		r2.findArea();
	}
}
