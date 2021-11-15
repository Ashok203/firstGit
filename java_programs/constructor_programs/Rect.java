class Rect 
{
	public int length;
	public int width;

	Rect(int l,int w)
	{
		length = l;
		width = w;
	}

	public void findArea()
	{
		int area = length*width;
		System.out.println("Area of Rectangle is : "+area);
	}
	public static void main(String[] args) 
	{
		Rect r1 = new Rect(5,8);
		Rect r2 = new Rect(4,4);
		r1.findArea();
		r2.findArea();
	}
}
