package n1exercici2;

public class Vehicle {

	public Vehicle() {
		System.out.println("constructor");
	}
	
	private void iniciar() {
		System.out.println("inicia");
	}
	
	private static void parar() {
		System.out.println("para");
	}
	
	private void accelerar() {
		System.out.println("accelera");
	}
	
	public static void main(String[] args) {
		Vehicle vehicle1 = new Vehicle();
		vehicle1.iniciar();
		Vehicle.parar();
		vehicle1.accelerar();
	}
}