package standardPrograms;

import java.util.Scanner;

public class QuotientWithoutOperator 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Divident :");
		int divident = sc.nextInt();
		System.out.println("Enter the Divisor :");
		int divisor = sc.nextInt();
		
		int temp = divident;
		int count = 0;
		
		while(divident>=divisor) {
			divident-=divisor;
			count++;
		}
		System.out.println("The Quotient of "+temp+" divisible by "+divisor+ " is :"+count);
	}
}
