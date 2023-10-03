package java_hometask_3;

public class HybridV extends Vehicle
{
	private HybridEngine engine;
	
	public HybridV(String name, String nameOfManufacturer, String engineSerialNumber, int displacement, int electricPower)
	{
		super(name, nameOfManufacturer);
		engine = new HybridEngine(engineSerialNumber, displacement, electricPower);
	}
	
	@Override
	public void ShowCharacteristics()
	{
		System.out.print("HybridV \"" + super.getName() + "\" from " + super.getManufacterer().getName() + ", ");
		System.out.print("engine serial-number: \"" + engine.getSerialNumber() + "\", ");
		System.out.print("displacement: " + engine.getDisplacement() + "ccm, ");
		System.out.println("electric power: " + engine.getElectricPower() + "kW");
	}
}
