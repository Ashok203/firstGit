package loopingStatements;

import java.util.Scanner;

public class EvenMN 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the m number :");
		int m = sc.nextInt();
		System.out.println("Enter the n number :");
		int n = sc.nextInt();
		
		while (m<=n)
		{
			if (m%2==0)
			{
				System.out.println(m+ " is a even number");
			}
			
			m++;
		}
	}
}
