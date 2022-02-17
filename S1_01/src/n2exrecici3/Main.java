package n2exrecici3;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Cycle> cycles = new ArrayList<Cycle>();
		cycles.add(new Unicycle());
		cycles.add(new Bicycle());
		cycles.add(new Tricycle());
		
		for (Cycle c : cycles) {
			ride(c);
			
			if (c instanceof Unicycle) {
				((Unicycle)c).balance();
			}
			else if (c instanceof Bicycle) {
				((Bicycle)c).balance();
			}
		}
	}
	
	public static void ride(Cycle c) {
		int nRodes;
		nRodes = c.wheels();
		System.out.println("Té " + nRodes + " roda/es");
	}
}
