class MainClass 
{
	public static void main(String[] args) 
	{
		Calender c1 = new Calender(4);
		System.out.println(c1.fetch());
		c1.update(-3);
	}
}
/* note Calender constructor and update method are
   dangerous statement
   handle the dangerous statement by using try catch block

   complete Main Class by handling the Exception */