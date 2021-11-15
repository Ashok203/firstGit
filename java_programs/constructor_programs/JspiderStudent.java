class JspiderStudent 
{
	public String name;
	public double tenthPercent;
	public double interPercent;
	public double degreePercent;
	public String location;

	JspiderStudent(String s,double q,double r,double a,String p)
	{
		name = s;
		tenthPercent = q;
		interPercent = r;
		degreePercent = a;
		location = p;
	}

	public void studentDetails()
	{
		System.out.println("*********************************************************");
		System.out.println("Name of the Student is : "+name);
		System.out.println("TenthPercent of the Student is : "+tenthPercent);
		System.out.println("DegreePercent of the Student is : "+degreePercent);
		System.out.println("Location of Student : "+location);
	}
	public static void main(String[] args) 
	{
		JspiderStudent s1 = new JspiderStudent("Ashok",47.1,89.9,8.06,"JNTU");
		JspiderStudent s2 = new JspiderStudent("Ravi",9.1,95.2,8.86,"JNTU");
		s1.studentDetails();
		s2.studentDetails();
	}
}
