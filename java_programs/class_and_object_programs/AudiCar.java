class AudiCar 
{
	public String model;
	public String color;
	public int topSpeed;
	public double mileage;

	public void displayCarInfo()
	{
		System.out.println("**************************************");
		System.out.println("Audi car model is  :"+this.model);
		System.out.println("Audi car color is  :"+this.color);
		System.out.println("Audi car top speed is  :"+this.topSpeed);
		System.out.println("Audi car mileage is  :"+this.mileage);
		System.out.println("**************************************");
	}
	public static void main(String[] args) 
	{
		AudiCar car1 = new AudiCar();
		AudiCar car2 = new AudiCar();
		AudiCar car3 = new AudiCar();
		car1.model = "A1";
		car1.color = "RED";
		car1.topSpeed = 300;
		car1.mileage = 8.2;
		car2.model = "A2";
		car2.color = "BLUE";
		car2.topSpeed = 302;
		car2.mileage = 8.6;
		car3.model = "A3";
		car3.color = "BLACK";
		car3.topSpeed = 320;
		car3.mileage = 9.0;
		car1.displayCarInfo();
		car2.displayCarInfo();
		car3.displayCarInfo();
	}
}
