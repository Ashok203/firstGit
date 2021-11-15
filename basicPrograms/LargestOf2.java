package basicPrograms;

import java.util.Scanner;

public class LargestOf2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first value :");
		int a = sc.nextInt();
		System.out.println("Enter the second value :");
		int b = sc.nextInt();
		
		System.out.println(a > b ? a+ " is largest" : b+ " is largest");
	}
}
