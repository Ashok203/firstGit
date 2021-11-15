interface Bike
{
	public void start();
}

class HeroHonda implements Bike
{
	public void start()
	{
		System.out.println("Kick start....");
	}
}

class Duke implements Bike
{
	public void start()
	{
		System.out.println("Self start...");
	}
}

class Bullet implements Bike
{
	public void start()
	{
		System.out.println("Self/Kick start...");
	}
}

class MainClass
{
	public static void main(String[] args)
	{
		race(new Duke());
		race(new HeroHonda());
		race(new Bullet());
	}
	public static void race(Bike b1)
	{
		b1.start();
	}
}