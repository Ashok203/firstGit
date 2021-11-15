package loopingStatements;

import java.util.Scanner;

public class NaturalNumbers 
{
	public static void main(String[] args) 
	{
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the N value :");
		int n = sc.nextInt();
		
		for(i = 1;i<=n;i++)
		{
			System.out.println(i);
		}
		
	}
}
