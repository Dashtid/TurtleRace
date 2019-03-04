import java.util.ArrayList;


public class TurtleRace {
	public static void main(String[] args) {
		ArrayList<RaceTurtle> listan = new ArrayList<RaceTurtle>();
		ArrayList<RaceTurtle> goal = new ArrayList<RaceTurtle>();
		RaceWindow w = new RaceWindow();
		

		/** Paddisarna */

		MoleTurtle t0 = new MoleTurtle(w, 1);
		listan.add(t0);
		AbsentMindedTurtle t1 = new AbsentMindedTurtle(w, 2, 45);
		listan.add(t1);
		AbsentMindedTurtle t2 = new AbsentMindedTurtle(w, 3, 35);
		listan.add(t2);
		DizzyTurtle t3 = new DizzyTurtle(w, 4, 3);
		listan.add(t3);
		MoleTurtle t4 = new MoleTurtle(w, 5);
		listan.add(t4);
		MoleTurtle t5 = new MoleTurtle(w, 6);
		listan.add(t5);
		AbsentMindedTurtle t6 = new AbsentMindedTurtle(w, 7, 71);
		listan.add(t6);
		DizzyTurtle t7 = new DizzyTurtle(w, 8, 5);
		listan.add(t7);
		
		System.out.println("\nPå startplats 1: " + listan.get(0).toString());
		System.out.println("På startplats 2: " + listan.get(1).toString());
		System.out.println("På startplats 3: " + listan.get(2).toString());
		System.out.println("\nPå startplats 4: " + listan.get(3).toString());
		System.out.println("På startplats 5: " + listan.get(4).toString());
		System.out.println("På startplats 6: " + listan.get(5).toString());
		System.out.println("\nPå startplats 7: " + listan.get(6).toString());
		System.out.println("På startplats 8: " + listan.get(7).toString());
		System.out.println("Tryck mus för att starta racet!");
		
		
		
		
		w.waitForMouseClick();

		while (listan.size() > 0) {
			for (int i = 0; i < listan.size(); i++) {
				listan.get(i).raceStep();
				RaceWindow.delay(2);
				if ((listan.get(i).getX() >= RaceWindow.X_END_POS)) {
					goal.add(listan.remove(i));
					i--;
				}
			}
		}

		System.out.println("\nPå plats 1: " + goal.get(0).toString());
		System.out.println("På plats 2: " + goal.get(1).toString());
		System.out.println("På plats 3: " + goal.get(2).toString());

	}

}
