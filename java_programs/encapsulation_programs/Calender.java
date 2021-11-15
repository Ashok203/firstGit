class Calender 
{
	private int monthNumber;

	public Calender(int monthNumber)
	{
		if(monthNumber >= 1 && monthNumber <= 12)
		{
			this.monthNumber = monthNumber;
		}
		else
		{
			throw new InvalidMonthNumberException();
		}
	}
	public int fetch()
	{
		return this.monthNumber;
	}
	public void update(int monthNumber)
	{
		if(monthNumber >= 1 && monthNumber <= 12)
		{
			this.monthNumber = monthNumber;
		}
		else
		{
			throw new InvalidMonthNumberException();
		}
	}
	
}
