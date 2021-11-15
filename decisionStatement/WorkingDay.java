package decisionStatement;

import java.util.Scanner;

public class WorkingDay 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the day number :");
		int day = sc.nextInt();
		
		switch(day)
		{
		case 1 :System.out.println("Sunday is not a working day");break;
		case 2 :System.out.println("Monday is a working day");break;
		case 3 :System.out.println("Tuesday is a working day");break;
		case 4 :System.out.println("Wednesday is a working day");break;
		case 5 :System.out.println("Thursday is a working day");break;
		case 6 :System.out.println("Friday is a working day");break;
		case 7 :System.out.println("Saturday is a working day");break;
		
		default :throw new invalidinputException ();   /*System.out.println("Invalid input");*/
		}
	}
}
