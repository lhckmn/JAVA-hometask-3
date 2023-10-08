package java_hometask_3;

public abstract class Vehicle
{
	private String name;
	private Manufacturer manufacturer;
	public abstract void ShowCharacteristics();
	
	public Vehicle()
	{
		this.name = "";
		this.manufacturer = new Manufacturer();
	}
	
	public Vehicle(String name, String nameOfManufacturer)
	{
		this.name = name;
		this.manufacturer = new Manufacturer(nameOfManufacturer);
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public Manufacturer getManufacturer()
	{
		return manufacturer;
	}

	public void setManufacturer(Manufacturer manufacturer)
	{
		this.manufacturer = manufacturer;
	}
}
