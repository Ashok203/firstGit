package loopingStatements;

import java.util.Scanner;

public class DivisibleBy5 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the M value :");
		int m = sc.nextInt();
		System.out.println("Enter the N value :");
		int n = sc.nextInt();
		
		for(int i = m;i<=n;i++)
		{
			if (i%5==0) 
			{
				System.out.println(i);
			}
		}
	}
}
