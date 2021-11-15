package standardPrograms;

import java.util.Scanner;

public class PerfectSquare 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value :");
		int n = sc.nextInt();
		boolean ischeck = false;
		
		for(int i = 1;i<=n;i++)
		{
			if(i*i==n)
			{
				ischeck =true;
				break;
			}
		}
		if (ischeck==true) {
			System.out.println(n+ " is a Perfect Square...!!!");
		}
		else
		{
			System.out.println(n+ " is not Perfect Square...!!!");
		}
	}
}
