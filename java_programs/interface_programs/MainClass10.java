interface Win
{
	public void go();
}

interface Win1
{
	public void go();
}

class Sample11 implements Win,Win1
{
	public void go()
	{
		System.out.println("go to park...");
	}
	
}

class MainClass10
{
	public static void main(String[] args)
	{
		Sample11 s11 = new Sample11();
		s11.go();
	}
}