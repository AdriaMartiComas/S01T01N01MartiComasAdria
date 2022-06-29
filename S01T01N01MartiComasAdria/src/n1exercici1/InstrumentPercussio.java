package n1exercici1;

public class InstrumentPercussio extends Instrument{

	public InstrumentPercussio(String nom, int preu) {
		super(nom, preu);
	}

	@Override
	public void tocar() {
		System.out.println("Està sonant un instrument de percussió");
	}
	


}
