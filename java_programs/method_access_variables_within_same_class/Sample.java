class Sample 
{
	public int z = 34;
	public void display()
	{
		System.out.println(z);/* direct access*/
		System.out.println(this.z);/* access through "this" keyword*/
	}
	public static void main(String[] args) 
	{
		Sample s1 = new Sample();
		Sample s2 = new Sample();
		Sample s3 = new Sample();
		s1.display();
		s2.display();
		s3.display();
	}
}


/*Direct access: Because non-static variable and non-static method are present in same object*/

/*"this" access: Because "this" keyword represents current object in execution by JVM*/