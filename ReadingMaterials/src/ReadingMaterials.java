public class ReadingMaterials
{
	private String name;

	public ReadingMaterials() 
	{
		name = "no character name yet";	
	}

	public ReadingMaterials(String initialName)
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
		System.out.println("Name of Characters: " + name);
	}

	public boolean hasSameName(ReadingMaterials otherReadingMaterials) 
	{
		return this.name.equalsIgnoreCase(otherReadingMaterials.name);
	}

}