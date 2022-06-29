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
				"Soc un block estatic i sempre sere el primer en apareixer a la consola quan s'instanci un objecte de la meva classe");
	}

}
