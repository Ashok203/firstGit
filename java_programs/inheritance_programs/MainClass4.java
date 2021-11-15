class Developer
{
	public String name;
	public int sal;
	public int yoe;
	public String role;
	public static String company = "HCL";

    Developer(String name,int sal,int yoe,String role)
	{
		this.name = name;
		this.sal = sal;
		this.yoe = yoe;
		this.role = role;
	}
	public void info()
	{
		System.out.println("------------------------------------");
		System.out.println("working company : "+company);
		System.out.println("emp name : "+this.name);
		System.out.println("emp sal  : "+this.sal);
		System.out.println("emp yoe : "+this.yoe);
		System.out.println("emp role : "+this.role);
	}
}

class Tester
{
	public String name;
	public int sal;
	public int yoe;
	public String role;
	public static String company = "HCL";


    Tester(String name,int sal,int yoe,String role)
	{
		this.name = name;
		this.sal = sal;
		this.yoe = yoe;
		this.role = role;

	}

	public void info()
	{
		System.out.println("------------------------------------");
		System.out.println("working company : "+company);
		System.out.println("emp name : "+this.name);
		System.out.println("emp sal  : "+this.sal);
		System.out.println("emp yoe : "+this.yoe);
		System.out.println("emp role : "+this.role);
	}
}

class MainClass4
{
	public static void main(String[] args)
	{
		Developer d1 = new Developer("ASHOK",18000,2,"back-end-developer");
		Tester t1 = new Tester("RAVI",21000,3,"manual tester");
		d1.info();
		t1.info();
	}
}