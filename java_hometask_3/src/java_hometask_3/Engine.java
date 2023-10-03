package java_hometask_3;

public abstract class Engine
{
	private String serialNumber;

	public Engine()
	{
		this.serialNumber = "";
	}
	
	public Engine(String serialNumber)
	{
		this.serialNumber = serialNumber;
	}
	
	public String getSerialNumber()
	{
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber)
	{
		this.serialNumber = serialNumber;
	}
}
