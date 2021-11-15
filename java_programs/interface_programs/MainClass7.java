interface Demo5
{
	public void fly();
}

interface Demo6
{
	public void jump();
}

interface Demo7 extends Demo5,Demo6
{
	public void run();
}

class Sample8 implements Demo7
{
	public void run()
	{
		System.out.println("run 12kms....");
	}

	public void jump()
	{
		System.out.println("jump high...");
	}

	public void fly()
	{
		System.out.println("fly like a bird...");
	}
}

class MainClass7
{
	public static void main(String[] args)
	{
		Sample8 s8 = new Sample8();
		s8.run();
		s8.jump();
		s8.fly();
	}
}