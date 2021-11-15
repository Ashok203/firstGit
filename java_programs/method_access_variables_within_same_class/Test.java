class Test 
{
	public int k = 67;

	public static void move()
	{
		Test t1 = new Test();
		Test t2 = new Test();
		Test t3 = new Test();
		System.out.println(t1.k);/* access through object reference variable*/
		System.out.println(t2.k);/* access through object reference variable*/
		System.out.println(t3.k);/* access through object reference variable*/
	}
	public static void main(String[] args) 
	{
		move();
	}
}


/*Through object reference: Because non-static variable can be multiple copy, present in each object. so,we have to specify which object.*/