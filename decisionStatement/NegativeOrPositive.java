package decisionStatement;

import java.util.Scanner;

public class NegativeOrPositive 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value :");
		int value = sc.nextInt();
		
		if (value >0) 
		{
			System.out.println(value+ " is a positive");
		}
		
		else if (value < 0) 
		{
			System.out.println(value+ " is a negative");
		}
		
		else {
			System.out.println(value+ " is a zero");
		}
	}
}
