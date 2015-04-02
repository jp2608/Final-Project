public class ElectronicEquipmentDemo 
{
	
	public static void main(String[] args)
	{
		Computer c = new Computer();
		Cellphone cp = new Cellphone();
		
		System.out.println("-Computer-\n ");
		c.setCost(999.99);
		c.setWeight(5.0);
		c.setManufacturer("Apple");
		c.setBattery("24 hrs");
		c.writeOutput();
		
		System.out.println("\n-Cell Phone-\n ");
		cp.setCost(499.99);
		cp.setWeight(1.0);
		cp.setManufacturer("Samsung Galaxy S6");
		cp.setBattery("7 hrs");
		cp.writeOutput();
		
	}
}