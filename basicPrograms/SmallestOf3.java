package basicPrograms;

import java.util.Scanner;

public class SmallestOf3 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first value :");
		int a = sc.nextInt();
		System.out.println("Enter the second value :");
		int b = sc.nextInt();
		System.out.println("Enter the third value :");
		int c = sc.nextInt();
		
		System.out.println(a<b && a<c ? a+ " is smallest" : b<c ? b+ " is smallest" : c+ " is smallest");
	}
}
