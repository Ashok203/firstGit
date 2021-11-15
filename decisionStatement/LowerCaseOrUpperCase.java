package decisionStatement;

import java.util.Scanner;

public class LowerCaseOrUpperCase 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value :");
		char ch = sc.next().charAt(0);
		
		if (ch >= 'A' && ch <= 'Z') 
		{ 
			System.out.println(ch+ " is UpperCase");
		}
		
		else if (ch >= 'a' && ch<= 'z') 
		{
			System.out.println(ch+ " is LowerCase");
		}
		
		else {
			System.out.println(ch+ " is not UpperCase or LowerCase");
		}
	}
}
