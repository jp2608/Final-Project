
public class SportsStatistics 
{ 
	private String name;

	public void Sports() 
	{
		name = "no name yet";	
	}

	public void Sports(String initialName) 
	{
		name = initialName;
	}

	public void setName(String newName)
	{
		name = newName;
	}

	public String getName()
	{
		return name;
	}

	public void writeOutput()
	{
		System.out.println("Name of team: " + name);
	}

	public boolean hasSameName(SportsDemo otherSports) 
	{
		return this.name.equalsIgnoreCase(otherSports.name);
	}
}