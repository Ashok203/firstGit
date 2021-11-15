package decisionStatement;

import java.util.Scanner;

public class Seasons 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Month Name :");
		String monthName = sc.next();
		monthName = monthName.toLowerCase();
		
		switch(monthName)
		{
		case "feb" :
		case "mar" :System.out.println("Summer");break;
		case "apr" :
		case "may" :
		case "jun" :System.out.println("Rainy");break;
		case "jul" :
		case "aug" :
		case "sep" :System.out.println("Spring");break;
		case "oct" :
		case "nov" :
		case "dec" :
		case "jan" :System.out.println("Winter");break;
		
		default : throw new InvalidMonthNameException();
		}
	}
}
