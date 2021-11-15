package loopingStatements;

import java.util.Scanner;

public class ProductBetweenMN 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the M value :");
		int m = sc.nextInt();
		System.out.println("Enter the N value :");
		int n = sc.nextInt();
		int product = 1;
		
		for(int i=m;i<=n;i++)
		{
			product = i*product;
		}
		System.out.println(product);
	}
}
