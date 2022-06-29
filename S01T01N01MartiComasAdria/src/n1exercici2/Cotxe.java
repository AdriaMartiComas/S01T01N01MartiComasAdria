package n1exercici2;

public class Cotxe {

	private static final String MARCA = "Ferrari";
	// MARCA es un valor constant a tots els objectes que s'instanciin.
	// No es podrà modificar. Per tant no pot estar al constructor ni
	// als setters
	private static String model;
	// model és un valor fixe de la classe, si es modifica, es modificara per a
	// totsels objectes instanciats de la classe Cotxe. No pot estar al constructor

	private final int potencia;
	//potencia és una constant, tindra un valor assignat al instanciar un objecte, desprès no es pot modificar

	public Cotxe(int potencia) {
		this.potencia = potencia;
	}

	public static String getModel() {
		return model;
	}

	public static void setModel(String model) {
		Cotxe.model = model;
	}

	public static String getMarca() {
		return MARCA;
	}

	public int getPotencia() {
		return potencia;
	}
	
	public static void frenar() {
		System.out.println("El vehicle està frenant");
	}
	
	public void accelerar() {
		System.out.println("El vehicle està accelerant");
	}

}
