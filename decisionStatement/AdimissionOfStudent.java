package decisionStatement;

import java.util.Scanner;

public class AdimissionOfStudent 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks :");
		int marks = sc.nextInt();
		
		if (marks >=25 && marks <=35) 
		{
			System.out.println(" Admission in the F Section.");
		}
		else if (marks > 35 && marks <= 45) 
		{
			System.out.println(" Admission in the E Section.");
		}
		else if (marks >45 && marks <= 65) 
		{
			System.out.println("Admission in the D Section.");
		}
		else if (marks >65 && marks <= 75) 
		{
			System.out.println("Admission in the C Section.");
		}
		else if (marks >75 && marks<= 85) 
		{
			System.out.println("Admission in the B Section.");
		}
		else if (marks > 85 && marks <= 100) 
		{
			System.out.println("Admission in the A Section.");
		}
		else {
			System.out.println("Invalid marks.");
		}
	}
}
