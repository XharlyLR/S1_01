package n1exercici8;

public class Main {

	public static void main(String[] args) {
		Amphibian frog1 = new Frog();
		frog1.moure();
		frog1.respirar();;
		frog1.menjar();
		// frog1.saltar(); error
		
		System.out.println();
		Frog frog2 = new Frog();
		frog2.moure();
		frog2.respirar();;
		frog2.menjar();
		frog2.saltar(); // no error
		
		System.out.println();
		Amphibian amfibi1 = new Amphibian();
		amfibi1.moure();
		amfibi1.respirar();;
		amfibi1.menjar();
	}

}
