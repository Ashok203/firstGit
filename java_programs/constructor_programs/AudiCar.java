class AudiCar 
{
	public String model;
	public String color;
	public int topSpeed;
	public int mileage;

	AudiCar(String m,String c,int s,int p)
	{
		model = m;
		color = c;
		topSpeed = s;
		mileage = p;
	}

	public void displayCarInfo()
	{
		System.out.println("****************************************");
		System.out.println("AudiCar model is : "+model);
		System.out.println("AudiCar color is : "+color);
		System.out.println("AudiCar topSpeed is : "+topSpeed);
		System.out.println("AudiCar mileage is : "+mileage);
	}
	public static void main(String[] args) 
	{
		AudiCar c1 = new AudiCar("A1","BLACK",220,15);
		AudiCar c2 = new AudiCar("A2","BLUE",250,20);
		AudiCar c3 = new AudiCar("A3","RED",275,25);
		c1.displayCarInfo();
		c2.displayCarInfo();
		c3.displayCarInfo();
	}
}
