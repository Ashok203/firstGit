package standardPrograms;

import java.util.Scanner;

public class SpyNumber 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value :");
		int n = sc.nextInt();
		
		int sum =0;
		int prod =1;
		int temp = n;
		
		while(n>0) {
			sum+=n%10;
			prod*=n%10;
			n/=10;
		}
		if(sum==prod) {
			System.out.println(temp+ " is a SPY Number..!!!");
		}
		else {
			System.out.println(temp+ " is not a SPY Number...!!!");
		}
	}
}
