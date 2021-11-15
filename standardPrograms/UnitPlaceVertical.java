package standardPrograms;

import java.util.Scanner;

public class UnitPlaceVertical 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value :");
		int n = sc.nextInt();
		 while(n!=0) {
			 int res = n%10;
			 System.out.println(res);
			 n/=10;
		 }
	}
}
