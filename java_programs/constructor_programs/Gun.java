class Gun 
{
	public int numberOfBullets;
	public String name;

	Gun(int p,String q)
	{
		numberOfBullets = p;
		name = q;
	}

	public void show()
	{
		System.out.println("***********************************");
		System.out.println("Bullets :"+numberOfBullets);
		System.out.println("Name :"+name);
	}
	public static void main(String[] args) 
	{
		Gun g1 = new Gun(6,"pistol");
		Gun g2 = new Gun(8,"rifel");
		Gun g3 = new Gun(116,"AK47");
		g1.show();
		g2.show();
		g3.show();
	}
}
