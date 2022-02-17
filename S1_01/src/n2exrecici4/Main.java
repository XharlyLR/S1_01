package n2exrecici4;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Rossegador> rossegadors = new ArrayList<Rossegador>();
		rossegadors.add(new Ratoli());
		rossegadors.add(new Jerbu());
		rossegadors.add(new Hamster());
		
		for(Rossegador r : rossegadors) {
			r.ensumar();
			r.rossegar();
			r.correr();
			System.out.println("");
		}
	}

}
