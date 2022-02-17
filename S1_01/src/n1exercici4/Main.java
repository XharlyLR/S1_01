package n1exercici4;

public class Main {

	public static void main(String[] args) {
		Vehicle vehicle1 = new Vehicle();
		vehicle1.iniciar();
		vehicle1.accelerar();
		Vehicle.parar();
		
		System.out.println();
		
		Vehicle vehicle2 = new Vehicle();
		vehicle2.iniciar();
		vehicle2.accelerar();
	}

}
