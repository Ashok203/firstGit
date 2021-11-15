class InvalidMonthNumberException extends RuntimeException 
{
	public String toString()
	{
		return "Given month number is out of range[1 to 12]";
	}
}
