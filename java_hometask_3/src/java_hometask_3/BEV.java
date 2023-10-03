package java_hometask_3;

public class BEV extends Vehicle
{
	private ElectricEngine engine;
	
	public BEV(String name, String nameOfManufacturer, String engineSerialNumber, int electricPower)
	{
		super(name, nameOfManufacturer);
		engine = new ElectricEngine(engineSerialNumber, electricPower);
	}
	
	@Override
	public void ShowCharacteristics()
	{
		System.out.print("BEV \"" + super.getName() + "\" from " + super.getManufacterer().getName() + ", ");
		System.out.print("engine serial-number: \"" + engine.getSerialNumber() + "\", ");
		System.out.println("electric power: " + engine.getElectricPower() + "kW");
	}
}
