package n1exercici1;

public class Vehicle {

	public Vehicle() {
		System.out.println("constructor");
	}
	
	public void iniciar() {
		System.out.println("mètode iniciar");
	}
	
	public static void main(String[] args) {
		Vehicle vehicle1 = new Vehicle();
		vehicle1.iniciar();
	}
}