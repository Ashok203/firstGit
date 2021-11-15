class IronMan
{
	public void fight()
	{
		System.out.println("fight with villans to save the world..");
	}
}

class TonyStark extends IronMan
{
	public void research()
	{
		System.out.println("Research and invent new thing..");
	}
}

class MainClass
{
	public static void main(String[] args)
	{
		IronMan im = (IronMan)new TonyStark();
		im.fight();
		TonyStark ts = (TonyStark) im;
		ts.fight();
		ts.research();
	}
}