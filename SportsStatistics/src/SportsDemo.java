
public class SportsDemo 
{
	public String name;
	public static void main(String[] args)
	{
		Tennis RogerFederer = new Tennis();
		Tennis lakers = new Tennis();
		Football eagles = new Football();
		Football redskins = new Football();
		
		System.out.println("-Tennis Players;\n ");
		RogerFederer.setName("Roger Federer");
		RogerFederer.setWins(1012);
		RogerFederer.writeOutput();
		
		lakers.setName("Novak Djokovic");
		lakers.setWins(623);
		lakers.writeOutput();
		
		System.out.println("\n-Football Teams;\n ");
		eagles.setName("Eagles");
		eagles.setWins(550);
		eagles.writeOutput();
		
		redskins.setName("Redkins");
		redskins.setWins(588);
		redskins.writeOutput();

	}


}
