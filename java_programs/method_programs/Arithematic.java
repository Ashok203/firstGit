/* WAP to for below requirement
   1. develop 3 methods 
   2. 1st static method to perform subtraction of int and dobule and return the result.
   3. 2nd non-static method to perform devision of 2 int's and return the result.
   4. 3rd non-static method to perform multiplication of 2 double's and return the result.
   5. 4th static method to perform addition of all above operation results and do not return
   the result rather print the addition result in the same method.
   6. call all the method from main method, receive the result of subtraction, multiplication, 
   devision and pass these results has input to addition method */

class Arithematic 
{
	public static double sub(int a,double b) 
	{
		double c= a-b;
		return c;
	}

	public int div(int r,int s)
	{
		int res = r/s;
		return res;
	}

	public double mul(double f,double g)
	{
		double w = f*g;
		return w;
	}

	public static void add(double c,int res,double w)
	{
		double q = c+res+w;
		System.out.println(q);
	}

	public static void main(String[] args)
	{
		double c = sub(3,2.5);
		
		Arithematic t1 = new Arithematic();
		int res = t1.div(4,2);
		
		double w = t1.mul(5,2);
		
		add(c,res,w);
	}
}
