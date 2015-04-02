public class ElectronicEquipments 
{
	private double cost;
	private double weight;
	private String manufacturer;
	private String battery;
	
	public ElectronicEquipments()
	{
		cost = 0;	
		weight = 0;
		manufacturer = "no manufacturer yet";
		battery = "no battery set yet";
	}
	
	public void setCost(double newCost)
	{
		cost = newCost;
	}
	public void setWeight(double newWeight) 
	{
		weight = newWeight;
	}
	public void setManufacturer(String newManufacturer) 
	{
		manufacturer = newManufacturer;
	}
	public void setBattery(String newBattery)
	{
		battery = newBattery;
	}
	
	public double getCost()
	{
		return cost;
	}
	public double getWeight()
	{
		return weight;
	}
	public String getManufacturer() 
	{
		return manufacturer;
	}
	public String getBattery()
	{
		return battery;
	}

}