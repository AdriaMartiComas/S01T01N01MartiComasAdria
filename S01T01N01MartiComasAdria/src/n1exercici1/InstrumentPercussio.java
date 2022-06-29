package n1exercici1;

public class InstrumentPercussio extends Instrument{
	
	public static int numBaquetes;

	public InstrumentPercussio(String nom, int preu) {
		super(nom, preu);
	}
	

	public static int getNumBaquetes() {
		return numBaquetes;
	}


	public static void setNumBaquetes(int numBaquetes) {
		InstrumentPercussio.numBaquetes = numBaquetes;
	}


	@Override
	public void tocar() {
		System.out.println("Està sonant un instrument de percussió");
	}
	
	static
	{

		System.out.println(
				"Soc un block estatic de la classe InstrumentPercusio");
	}
	


}
