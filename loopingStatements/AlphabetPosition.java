package loopingStatements;

public class AlphabetPosition 
{
	public static void main(String[] args) {
		int position = 1;
		for(char ch = 'A';ch<='Z';ch++)
		{
			System.out.println(position++ +" ---> "+ ch);
		}
	}
}
