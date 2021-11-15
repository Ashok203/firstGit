package decisionStatement;

import java.util.Scanner;

public class Result 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value : ");
		int marks = sc.nextInt();
		
		if(marks >= 35)
		{
			System.out.println("Result is : PASS");
		}
		else
		{
			System.out.println("Result is : FAIL");
		}
	}
}
