package decisionStatement;

import java.util.Scanner;

public class DigitOrAlphabetOrSpecialCharacter 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value :");
		char ch = sc.next().charAt(0);
		
		if (ch >= 'A' && ch <= 'Z' || ch >='a' && ch <= 'z') 
		{
			System.out.println(ch+ " is an Alphabet");
		}
		
		else if (ch >= '0' && ch <= '9') 
		{
			System.out.println(ch+ " is Digit");
		}
		
		else 
		{
			System.out.println(ch+ " is a specialCharacter");
		}
		
	}
}
