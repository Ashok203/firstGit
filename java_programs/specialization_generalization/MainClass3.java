/* Define all the specialized method as non-static in the another  
   class, and call the methods from main method in main class*/



class Draw1
{


/* display method is specialized to Circle type object */

	public void display(Circle c1)
	{
		System.out.println("-------Circle properties--------");
		c1.rotate();
		c1.findArea();
	}
/* info method is specialized to Rect type object */
	public void info(Rect r1)
	{
		System.out.println("-------Rect properties----------");
		r1.rotate();
		r1.getArea();
	}

/*print method is specialized to Tri type object */
	public void print(Tri t1)
	{
		System.out.println("-------Tri properties-----------");
		t1.rotate();
		t1.printArea();
	}
}

class MainClass3
{
	public static void main(String[] args)
	{
		Draw1 d1 = new Draw1();
		d1.display(new Circle());
		d1.info(new Rect());
		d1.print(new Tri());
	}

}