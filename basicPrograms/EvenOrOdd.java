package basicPrograms;

import java.util.Scanner;

public class EvenOrOdd 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value :");
		int a = sc.nextInt();
		
		System.out.println(a % 2 ==0 ? a+ " is even" : a+ " is odd");
	}
}
