package n1exercici3;

public class Vehicle {
	
	static {
		System.out.println("inicia static");
	}
	
	{
		System.out.println("inicia instància");
	}
	
	public Vehicle() {
		System.out.println("constructor");
	}
	
	public void iniciar() {
		System.out.println("inicia");
	}
	
	public static void parar() {
		System.out.println("para");
	}
	
	public void accelerar() {
		System.out.println("accelera");
	}
}