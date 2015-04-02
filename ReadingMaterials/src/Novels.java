public class Novels extends ReadingMaterials 
{
	private int pages;
	public Novels() {
		super();
		pages = 0;
	}

	public Novels(String intialName, int initialPages) 
	{
		super(intialName);
		pages = initialPages;
	}

	public void reset(String newName, int newPages) 
	{
		setName(newName);
		pages = newPages;
	}

	public int getPages() 
	{
		return pages;
	}

	public void setPages(int newPages) 
	{
		pages = newPages;
	}

	public void writeOutput() 
	{
		System.out.println("Characters Name: " + getName());
		System.out.println("Amount of Pages: " + pages);
	}

	public boolean equals(Novels otherNovels) 
	{
		return this.hasSameName(otherNovels) && (this.pages == otherNovels.pages);
	}
}
