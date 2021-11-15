/* Define all the specialized method in another class, and
   call the methods from main method present in main class*/


class Draw
{


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

class MainClass2
{
	public static void main(String[] args)
	{
		Draw.display(new Circle());
		Draw.info(new Rect());
		Draw.print(new Tri());
	}

}