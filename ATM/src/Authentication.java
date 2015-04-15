
public class Authentication 
{
	static String pin = "1234";
	
	public static boolean pinAuthentication(String enteredPin)
	{
		if (enteredPin.equals(pin))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
