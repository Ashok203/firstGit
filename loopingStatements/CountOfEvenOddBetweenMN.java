package loopingStatements;

import java.util.Scanner;

public class CountOfEvenOddBetweenMN 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the M value :");
		int m = sc.nextInt();
		System.out.println("Enter the N value :");
		int n = sc.nextInt();
		
		int Ecount=0;
		int Ocount=0;
		
		for(int i = m;i<=n;i++)
		{
			if(i%2==0) {
				Ecount++;
			}
			else {
				Ocount++;
			}
		}
		System.out.println("Even Number count is : "+Ecount);
		System.out.println("Odd Number count is : "+Ocount);
	}
}
