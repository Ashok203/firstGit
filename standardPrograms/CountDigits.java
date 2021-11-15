package standardPrograms;

import java.util.Scanner;

public class CountDigits 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Digit :");
		int n = sc.nextInt();
		
		int temp = n;
		int count =0;
		 while(n>0) {
			 count++;
			 n/=10;
		 }
		 System.out.println("The count of digits "+temp+ " is : "+count);
	}
}
