package loopingStatements;

import java.util.Scanner;

public class OddMN
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the m number :");
		int m = sc.nextInt();
		System.out.println("Enter the n number :");
		int n = sc.nextInt();
		
		while (n>=m)
		{
			if (n%2==1) 
			{
				System.out.println(n+ " is a odd number");
			}
			
			n--;
		}
	}
}
