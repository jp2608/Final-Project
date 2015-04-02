public class Tennis extends SportsDemo 
{
	private int wins;

	public Tennis() 
	{
		super();
		wins = 0;
	}

	public Tennis(String intialName, int initialWins) 
	{
		super();
		wins = initialWins;
	}

	public void reset(String newName, int newWins) 
	{
		setName(newName);
		wins = newWins;
	}

	public int getWins() 
	{
		return wins;
	}

	public void setWins(int newWins) 
	{
		wins = newWins;
	}

	public void writeOutput() 
	{
		System.out.println("Team Name: " + getName());
		System.out.println("Amount of Wins: " + wins);
	}

	public String getName() 
	{
		return name;
	}

	private boolean hasSameName(Tennis otherTennis) 
	{
		return false;
	}

	public void setName(String initialName) 
	{
		this.name = initialName;
	}
	public boolean equals(Tennis otherTennis)
	{
		return this.hasSameName(otherTennis) && (this.wins == otherTennis.wins);
	}
}