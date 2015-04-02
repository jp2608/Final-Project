public class Football extends SportsDemo 
{
	private int wins;

	public Football() 
	{
		super();
		wins = 0;
	}

	public Football(String intialName, int initialWins) 
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
	private String getName() 
	{
		return name;
	}

	public boolean equals(Football otherFootball) 
	{
		return this.hasSameName(otherFootball) && (this.wins == otherFootball.wins);
	}

	private boolean hasSameName(Football otherFootball) 
	{
		return false;
	}

	public void setName(String initialName) 
	{
		this.name = initialName;
	}
}