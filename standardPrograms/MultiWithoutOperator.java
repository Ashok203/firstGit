package standardPrograms;

import java.util.Scanner;

public class MultiWithoutOperator 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value :");
		int n = sc.nextInt();
		
		int sum = 0;
		for(int i = 1;i<=10;i++) {
			sum+=n;
			System.out.println(n+"*"+i+" ="+sum);
		}
	}
}
