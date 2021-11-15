package loopingStatements;

public class LowerUpperCaseInHorizontal 
{
	public static void main(String[] args) 
	{
		for(char ch = 'a';ch<='z';ch++)
		{
			System.out.print(ch+ " ");
		}
		System.out.println();
		
		for(char c = 'A';c<='Z';c++)
		{
			System.out.print(c+ " ");
		}
	}
}
