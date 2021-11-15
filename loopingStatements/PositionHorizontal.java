package loopingStatements;

public class PositionHorizontal 
{
	public static void main(String[] args) {
		int position = 1;
		for(char ch ='A';ch<='Z';ch++)
		{
			System.out.print(position++ +" ");
		}
		System.out.println();
		for(char ch='A';ch <= 'Z';ch++)
		{
			System.out.print(ch+ " ");
		}
	}
}
