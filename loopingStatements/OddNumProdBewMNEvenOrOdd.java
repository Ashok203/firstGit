package loopingStatements;

import java.util.Scanner;

public class OddNumProdBewMNEvenOrOdd 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the M value :");
		int m = sc.nextInt();
		System.out.println("Enter the N value :");
		int n = sc.nextInt();
		
		int prod = 1;
		for (int i = m; i <=n; i++) 
		{
			if(i%2==1)
			{
				prod *=i;
			}
		}
		if (prod % 2==0)
		{
			System.out.println(prod+ "is a Even Number ...!!!");
		}
		else
		{
			System.out.println(prod+ "is a Odd Number...!!!");
		}
	}
}
