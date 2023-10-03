package java_hometask_3;

public class HybridEngine extends Engine
{
	private int displacement;
	private int electricPower;
	
	public HybridEngine()
	{
		super();
		this.displacement = 0;
		this.electricPower = 0;
	}
	
	public HybridEngine(String serialNumber, int displacement, int electricPower)
	{
		super(serialNumber);
		this.displacement = displacement;
		this.electricPower = electricPower;
	}

	public int getDisplacement()
	{
		return displacement;
	}

	public void setDisplacement(int displacement)
	{
		this.displacement = displacement;
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
