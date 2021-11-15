package decisionStatement;

import java.util.Scanner;

public class DayByReadingNumber 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the day number :");
		int day = sc.nextInt();
		
		switch(day)
		{
		case 1 :System.out.println("Sunday");break;
		case 2 :System.out.println("Monday");
		case 3 :System.out.println("Tuesday");
		case 4 :System.out.println("Wednesday");
		case 5 :System.out.println("Thursday");
		case 6 :System.out.println("Friday");
		case 7 :System.out.println("Saturday");break;
		
		default :throw new DayNumberInvalid ();  /*System.out.println("Invalid input");*/
		}
	}
}
