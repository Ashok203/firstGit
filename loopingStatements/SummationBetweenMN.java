package loopingStatements;

import java.util.Scanner;

public class SummationBetweenMN 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the M value :");
		int m = sc.nextInt();
		System.out.println("Enter the N value :");
		int n = sc.nextInt();
		int sum = 0;
		
		for(int i = m;i<=n;i++)
		{
			sum = i+sum;
		}
		System.out.println(sum);
		
	}
}
