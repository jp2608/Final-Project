public class Authentication 
{
	static String pin = "1234";
	
	public static boolean pinAuthentication(String input)
	{
		if (input.equals(pin))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}