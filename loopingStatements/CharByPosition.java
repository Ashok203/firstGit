package loopingStatements;

import java.util.Scanner;

public class CharByPosition 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the position :");
		int pos = sc.nextInt();
		int count = 0;
		
		for(char ch = 'a';ch<='z';ch++)
		{
			count++;
			if(count == pos) {
				System.out.println("The character '"+ch+ " is present in the position "+pos);
			}
		}
	}
}
