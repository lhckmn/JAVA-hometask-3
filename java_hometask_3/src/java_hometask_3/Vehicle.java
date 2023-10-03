package java_hometask_3;

public abstract class Vehicle
{
	private String name;
	private Manufacturer manufacterer;
	public abstract void ShowCharacteristics();
	
	public Vehicle()
	{
		this.name = "";
		this.manufacterer = new Manufacturer();
	}
	
	public Vehicle(String name, String nameOfManufacturer)
	{
		this.name = name;
		this.manufacterer = new Manufacturer(nameOfManufacturer);
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public Manufacturer getManufacterer()
	{
		return manufacterer;
	}

	public void setManufacterer(Manufacturer manufacterer)
	{
		this.manufacterer = manufacterer;
	}
}
