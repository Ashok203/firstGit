/* WAP for single level inheritance with method overriding and 
   perform upcasting and then call the method*/


class Father
{
	public void car()
	{
		System.out.println("car color orange..");
	}
}

class Son extends Father
{
	public void car()
	{
		System.out.println("car color white...");
	}
}

class MainClass2
{
	public static void main(String[] args)
	{
		Father f1 = (Father)new Son();
		f1.car();
	}
}