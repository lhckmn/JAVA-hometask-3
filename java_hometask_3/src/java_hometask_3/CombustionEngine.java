package java_hometask_3;

public class CombustionEngine extends Engine
{
	private int displacement;
	
	public CombustionEngine()
	{
		super();
		this.displacement = 0;
	}
	
	public CombustionEngine(String serialNumber, int displacement)
	{
		super(serialNumber);
		this.displacement = displacement;
	}

	public int getDisplacement()
	{
		return displacement;
	}

	public void setDisplacement(int displacement)
	{
		this.displacement = displacement;
	}
}
