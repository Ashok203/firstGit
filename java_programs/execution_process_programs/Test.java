/* WAP to create non-static method and call from main method 
Draw execution diagram*/

class Test 
{
	public void dance()
	{
		System.out.println("dance like a peacock....");
	}
	public static void main(String[] args) 
	{
		System.out.println("main starts....");
		Test t2 = new Test();
		t2.dance();
		System.out.println("main ends...");
	}
}
