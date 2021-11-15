class Car
{
	public String carName;
	public int topSpeed;
	public int mileAge;

	public void carInfo()
	{
		System.out.println("name of car  : "+this.carName);
		System.out.println("Speed of car : "+this.topSpeed);
		System.out.println("mileAge of car : "+this.mileAge);
	}
}

class PetrolCar extends Car
{
	PetrolCar(String carName,int topSpeed,int mileAge)
	{
		this.carName = carName;
		this.topSpeed = topSpeed;
		this.mileAge = mileAge;
	}

	public void info()
	{
		System.out.println("-------------Petrolcar----------------");
		carInfo();
	}
}

class DiselCar extends Car
{
	DiselCar(String carName,int topSpeed,int mileAge)
	{
		this.carName = carName;
		this.topSpeed = topSpeed;
		this.mileAge = mileAge;

	}

	public void info()
	{
		System.out.println("-----------------Diselcar-------------");
		carInfo();
	}
}

class MainClass6
{
	public static void main(String[] args)
	{
		PetrolCar p1 = new PetrolCar("AUDI",200,15);
		DiselCar d1  = new DiselCar("BENZ",250,14);
		p1.info();
		d1.info();


	}
}