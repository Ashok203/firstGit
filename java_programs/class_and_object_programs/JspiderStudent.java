class JspiderStudent 
{
	public String name;
	public double tenthPercent;
	public double interPercent;
	public double degreePercent;
	public static String location;

	public void StudentDetails()
	{
		System.out.println("*******************************************************");
		System.out.println("Name of the Student is :"+name);
		System.out.println("TenthPercent of the Student is :"+tenthPercent);
		System.out.println("InterPercent of the Student is :"+interPercent);
		System.out.println("DegreePercent of the student is :"+degreePercent);
		System.out.println("Location of the student instute is :"+location);
		System.out.println("*******************************************************");
	}
	public static void main(String[] args) 
	{
		JspiderStudent s1 = new JspiderStudent();
		JspiderStudent s2 = new JspiderStudent();
		s1.name = "ASHOK";
		s1.tenthPercent = 47.1;
		s1.interPercent = 89.9;
		s1.degreePercent = 8.06;
		s1.location = "JNTU";
		s2.name = "RAVI";
		s2.tenthPercent = 9.6;
		s2.interPercent = 95.6;
		s2.degreePercent = 8.56;
		s2.location = "JNTU";
		s1.StudentDetails();
		s2.StudentDetails();
	}
}
