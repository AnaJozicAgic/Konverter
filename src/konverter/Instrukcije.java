package konverter;

public class Instrukcije {

	// Metoda kgUf
	public static void kilogrameUfunte(double a) {
		double funte = a * 2.20462262;
		System.out.println(a + " kilograma je "+funte+" funti.");
	}

	// Metoda fUkg
	public static void funteUkilograme(double a) {
		double kile = a * 0.45359237;
		System.out.println(a + " funti je "+kile+ " kilograma.");
	}

	// Metoda cUi
	public static void centimetreUinche(double a, double b) {

	}

	// Metoda iUc
	public static void incheUcentimetre(double a, double b) {

	}

	// Metoda za pretvaranje cUf
	public double celziuseUfarenhaite(double celzius) {
		return ((celzius * 1.8) + 32);
	}

}
