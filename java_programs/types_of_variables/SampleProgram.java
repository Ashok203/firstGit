/* WAP to create 2 non-static variables and print in main method */

class SampleProgram 
{

	public boolean a = true;
	public String s = "ASHOK IS";


	public static void main(String[] args) 
	{
		SampleProgram s1 = new SampleProgram();
		System.out.println(s1.s);
		System.out.println(s1.a);
	}
}
