package n1exercici4;

public class Vehicle {
	static final String CAMP_STATIC_FINAL = "Camp Static Final";
	final String CAMP_FINAL; // CAMP_FINAL = "Camp Final" aqu� tamb� es v�lid per� despr�s no es podr� donar-li valor al constructor
	static String campStatic;
	
	static {
		System.out.println("inicia static");
	}
	
	{
		System.out.println("inicia inst�ncia");
	}
	
	public Vehicle() {
		System.out.println("constructor");
		CAMP_FINAL = "Camp Final";
		campStatic = "Camp Static";
	}
	
	public void iniciar() {
		System.out.println("inicia");
		campStatic = "Camp Static!";
	}
	
	public static void parar() {
		System.out.println("para");
	}
	
	public void accelerar() {
		System.out.println("accelera");
	}
}