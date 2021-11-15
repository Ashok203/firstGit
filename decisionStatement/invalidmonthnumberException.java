package decisionStatement;

public class invalidmonthnumberException extends RuntimeException 
{
	public String toString()
	{
		return "invalid month number !! enter the number "
				+ "between 1 to 12" ;
	}
}
