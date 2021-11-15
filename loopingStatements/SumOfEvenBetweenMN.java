package loopingStatements;

import java.util.Scanner;

public class SumOfEvenBetweenMN 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the M value :");
		int m = sc.nextInt();
		System.out.println("Enter the N value :");
		int n = sc.nextInt();
		
		int sum = 0;
		
		for(int i=m; i<=n; i++)
		{
			if (i%2==0)
			{
				sum+=i;
			}
		}
		System.out.println("The Summation of Even Numbers between"+m+ "and "+n+ " is : "+sum);
	}
}
