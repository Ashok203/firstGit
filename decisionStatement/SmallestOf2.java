package decisionStatement;

import java.util.Scanner;

public class SmallestOf2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first value :");
		int value1 = sc.nextInt();
		System.out.println("Enter the second value :");
		int value2 = sc.nextInt();
		
		if(value1 <= value2)
		{
			System.out.println(value1+ " is the smallest");
		}
		
		else
		{
			System.out.println(value2+ " is the smallest");
		}
	}
}
