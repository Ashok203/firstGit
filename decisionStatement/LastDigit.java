package decisionStatement;

import java.util.Scanner;

public class LastDigit 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the value : ");
		int num = sc.nextInt();
		
		if(num % 10 ==3)
		{
			System.out.println(num+ " last digit is 3");
		}
		else
		{
			System.out.println(num+ "  last digit is not 3");
		}
	}
}
