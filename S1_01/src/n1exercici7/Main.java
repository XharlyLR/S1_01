package n1exercici7;

public class Main {

	public static void main(String[] args) {
		Amphibian frog1 = new Frog();
		frog1.moure();
		frog1.respirar();;
		frog1.menjar();
		// frog1.saltar(); error
		
		System.out.println();
		Frog frog2 = new Frog();
		frog2.saltar(); // no error
	}

}
