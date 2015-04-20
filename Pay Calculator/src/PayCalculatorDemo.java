public class PayCalculatorDemo
{
	public static void main(String[] args)
	{	
		double payRate=100;
		double hour=8.5;
		PayCalculator regularPay = new RegularPay(payRate);		
		System.out.println("The Regular Pay is $ "+regularPay.computePay(hour)); //computes reg pay
		
		PayCalculator hazardPay = new HazardPay(payRate);
		System.out.println("The Hazard Pay is $ "+hazardPay.computePay(hour)); //computes haz pay
	}

}