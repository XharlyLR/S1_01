package n2exrecici1;

public class Main {

	public static void main(String[] args) {
		Cycle unicycle1 = new Unicycle();
		Cycle bicycle1 = new Bicycle();
		Cycle tricycle1 = new Tricycle();
		
		ride(unicycle1);
		ride(bicycle1);
		ride(tricycle1);
	}
	
	public static void ride(Cycle c) {
		System.out.println("Es mou " + c);
	}
}
