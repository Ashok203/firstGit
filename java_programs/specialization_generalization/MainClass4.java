/* Define a generalized method as static and inside the method 
   call all the methods of Circle,Rect,Tri and call generalized
   method in main method */

class MainClass4
{
	public static void main(String[] args)
	{
		details(new Circle());
		details(new Rect());
		details(new Tri());
	}

	public static void details(Shape s1)
	{
		s1.rotate();

		if(s1 instanceof Tri)
		{
			Tri t1 = (Tri)s1;
			t1.printArea();
		}
		else if(s1 instanceof Circle)
		{
			Circle c1 = (Circle)s1;
			c1.findArea();
		}
		else if(s1 instanceof Rect)
		{
			Rect r1 = (Rect)s1;
			r1.getArea();
		}
		else
		{
			System.out.println("Wrong object given");
		}
	}
}