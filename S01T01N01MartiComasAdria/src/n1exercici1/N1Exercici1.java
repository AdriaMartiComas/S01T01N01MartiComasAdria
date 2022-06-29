package n1exercici1;

public class N1Exercici1 {

	public static void main(String[] args) {
		InstrumentCorda guitarra = new InstrumentCorda("Guitarra Acústica", 700);
		InstrumentCorda violi = new InstrumentCorda("violi", 1000);
		InstrumentVent trompeta = new InstrumentVent("Trompeta", 500);
		InstrumentPercussio caixa = new InstrumentPercussio("Caixa", 350);

		guitarra.setPreu(800);

		System.out.println("\n" + guitarra);
		guitarra.tocar();
		
		System.out.println("\n" + violi);
		violi.tocar();

		System.out.println("\n" + trompeta);
		trompeta.tocar();

		System.out.println("\n" + caixa);
		caixa.tocar();

	}

}

/*
 * En un grup de música hi ha diferents tipus d’instruments musicals. Hi ha
 * instruments de vent, de corda i de percussió.
 * 
 * Tots els instruments tenen com a atributs el seu nom, i el seu preu. A més,
 * tenen un mètode anomenat tocar(). Aquest, és abstracte a la classe instrument
 * i, per tant, s’ha d’implementar a les classes filles. Si s’està tocant un
 * instrument de vent, el mètode ha de mostrar per consola:
 * "Està sonant un instrument de vent", si s’està tocant un instrument de corda:
 * “Està sonant un instrument de corda” i si s’està tocant un instrument de
 * percussió: “Està sonant un instrument de percussió”.
 * 
 * 
 * El procés de càrrega d'una classe només té lloc una vegada. Demostra que la
 * càrrega pot ser provocada per la creació de la primera instància d'aquesta
 * classe o per l'accés a un membre estàtic d'aquesta.
 * 
 * Cerca informació sobre els blocs d'inicialització i blocs estàtics en Java.
 * 
 */