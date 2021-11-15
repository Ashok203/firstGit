class Flower 
{
	public String flowerName;

	Flower(String a)
	{
		flowerName = a;
	}

	public void printFlowerDetails()
	{
		System.out.println("Flower name is : "+flowerName);
	}
	public static void main(String[] args) 
	{
		Flower f1 = new Flower("Lilly");
		Flower f2 = new Flower("Jasminee");
		f1.printFlowerDetails();
		f2.printFlowerDetails();
	}
}
