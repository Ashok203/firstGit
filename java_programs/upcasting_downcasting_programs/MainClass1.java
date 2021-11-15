class Car
{
	public void move()
	{
		System.out.println("move on road..");
	}
}

class FlyingCar extends Car
{
	public void fly()
	{
		System.out.println("take off...");
	}
}

class WaterCar extends Car
{
	public void ride()
	{
		System.out.println("ride on waves...");
	}
}

class MainClass1
{
	public static void main(String[] args)
	{
		Car c1 = (Car)new FlyingCar();
		c1.move();
		FlyingCar fc = (FlyingCar)c1;
		fc.move();
		fc.fly();
		System.out.println("---------------------------------");
		Car c2 = (Car)new WaterCar();
		c2.move();
		WaterCar wc = (WaterCar)c2;
		wc.move();
		wc.ride();
	}
}