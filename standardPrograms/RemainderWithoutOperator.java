package standardPrograms;

import java.util.Scanner;

public class RemainderWithoutOperator 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Divident :");
		int divident = sc.nextInt();
		System.out.println("Enter the Divisor :");
		int divisor = sc.nextInt();
		
		int temp = divident;
		
		while(divident >= divisor) {
			divident-=divisor;
		}
		System.out.println("The Remainder of "+temp+ " divisible by "+divisor+ " is :"+divident);
	}
}
