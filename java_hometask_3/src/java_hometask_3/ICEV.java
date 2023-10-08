package java_hometask_3;

public class ICEV extends Vehicle
{
	private CombustionEngine engine;
	
	public ICEV(String name, String nameOfManufacturer, String engineSerialNumber, int displacement)
	{
		super(name, nameOfManufacturer);
		engine = new CombustionEngine(engineSerialNumber, displacement);
	}
	
	@Override
	public void ShowCharacteristics()
	{
		System.out.print("ICEV \"" + super.getName() + "\" from " + super.getManufacturer().getName() + ", ");
		System.out.print("engine serial-number: \"" + engine.getSerialNumber() + "\", ");
		System.out.println("displacement: " + engine.getDisplacement() + "ccm");
	}

}
