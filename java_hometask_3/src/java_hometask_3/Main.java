package java_hometask_3;

public class Main
{

	public static void main(String[] args)
	{
		Vehicle[] vehicles = new Vehicle[5];
		vehicles[0] = new ICEV("Passat 3BG", "VW", "3WFMN", 1900);
		vehicles[1] = new BEV("Model S", "Tesla", "9FHSG", 750);
		vehicles[2] = new HybridV("Leon Hybrid", "Seat", "5BFDL", 1000, 45);
		vehicles[3] = new BEV("Zoe", "Renault", "4DHAW", 120);
		vehicles[4] = new ICEV("Golf", "VW", "1NBDE", 1200);
		
		for(int i = 0; i < vehicles.length; i++)
		{
			vehicles[i].ShowCharacteristics();
		}
	}

}
