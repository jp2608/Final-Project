public class HazardPay extends PayCalculator 
{
	public HazardPay(double payRate)
	{
		super(payRate);
	}
	
	public double computePay(double hour)
	{
		return payRate*hour*1.5;
	}
}