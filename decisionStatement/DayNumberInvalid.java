package decisionStatement;

public class DayNumberInvalid extends RuntimeException 
{
	public String toString()
	{
		return "Invalid day number !! Enter the day number between 1 to 7";
	}
}
