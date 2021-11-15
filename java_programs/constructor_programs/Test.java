class Test 
{
	Test(int a)
	{
		System.out.println("Inside constructor, a value is : "+a);
	}
	public static void main(String[] args) 
	{
		Test t1 = new Test(3);
		Test t2 = new Test(32);
	}
}
