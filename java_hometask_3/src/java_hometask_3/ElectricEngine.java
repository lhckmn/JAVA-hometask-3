package java_hometask_3;

public class ElectricEngine extends Engine
{
	private int electricPower;
	
	public ElectricEngine()
	{
		super();
		this.electricPower = 0;
	}
	
	public ElectricEngine(String serialNumber, int electricPower)
	{
		super(serialNumber);
		this.electricPower = electricPower;
	}

	public int getElectricPower()
	{
		return electricPower;
	}

	public void setElectricPower(int electricPower)
	{
		this.electricPower = electricPower;
	}
}
