package n1exercici1;

public class InstrumentCorda extends Instrument {

	public InstrumentCorda(String nom, int preu) {
		super(nom, preu);
	}

	@Override
	public void tocar() {
		System.out.println("Està sonant un instrument de corda");
	}
	
	static
	{

		System.out.println(
				"Soc un block estatic de la classe InstrumentCorda");
	}

}
