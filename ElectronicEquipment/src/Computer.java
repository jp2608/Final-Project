public class Computer extends ElectronicEquipments
{

	public void writeOutput() 
	{
		System.out.println("Cost:$ " + getCost());
		System.out.println("Weight: " + getWeight() + " lb");
		System.out.println("Manufacturer: " + getManufacturer());
		System.out.println("Battery Life: " + getBattery());
	}

}