public class RegularPay extends PayCalculator
{
	
	public RegularPay(double payRate) 
	{
		super(payRate);
	}
	
	public double computePay(double hour) 
	{
		return(payRate*hour);
	}
}