package decisionStatement;

import java.util.Scanner;

public class DayDetails 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Time :");
		int time = sc.nextInt();
		
		if (time >= 0 && time<4 || time >= 20 && time< 24)
		{
			System.out.println("It is Night ");
		}
		else if (time >= 4 && time < 12) 
		{
			System.out.println("It is Morning");
		}
		else if (time >= 12 && time <16)
		{
			System.out.println("It is Afternoon");
		}
		else if (time >=16 && time <20) 
		{
			System.out.println("It is Evening");
		}
		else {
			System.out.println("User you have enterd wrong input");
		}
	}
}
