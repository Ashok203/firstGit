package loopingStatements;

import java.util.Scanner;

public class PosByChar 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character :");
		char ch = sc.next().charAt(0);
		ch = Character.toUpperCase(ch);
		int pos = 0;
		
		for(char c = 'A'; c <= 'Z';c++)
		{
			pos++;
			if(ch ==c)
			{
				System.out.println("The position of the character '"+ch+ "' is :" +pos);
				break;
			}
		}
	}
}
