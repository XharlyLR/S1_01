package n1exercici5;

public class Animal {
	public void correr(int vel) {
		System.out.println("Està corrent a " + vel + " m/s");
	}

	public void correr(int vel, int acc) {
		System.out.println("Està corrent a " + vel + " m/s, " + "amb una acceleració de " + acc + "m/s2");
	}

	public void correr(boolean esMou) {
		if (esMou)
			System.out.println("Està corrent");
		else
			System.out.println("Està quiet");
	}
}
