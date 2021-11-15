package decisionStatement;

import java.util.Scanner;

public class SpecialCharacter 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value :");
		char ch = sc.next().charAt(0);
		
		if (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z' || ch >= '0' && ch <= '9')
		{
			System.out.println(ch+ " is not special character");
		}
		
		else 
		{
			System.out.println(ch+ " is a special character");
		}
	}
}
