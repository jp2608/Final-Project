public class ReadingMaterialDemo 
{
	
	public static void main(String[] args)
	{
		StoryBook b = new StoryBook();
		Novels n = new Novels();
		
		System.out.println("-Story Book-\n ");
		b.setName("CharacterName1: Calvin, CharaterName2: Hobbes");
		b.setPages(65);
		b.writeOutput();
		
		System.out.println("\n-Novel-\n ");
		n.setName("CharacterName1: John, CharaterName2: Scott");
		n.setPages(83);
		n.writeOutput();
		
	}
}