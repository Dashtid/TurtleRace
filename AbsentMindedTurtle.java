import java.util.Random;

public class AbsentMindedTurtle extends RaceTurtle {
	private int r; //Sköldpaddans tankspriddhetsgrad.
	private static Random rand = new Random();
	
	public AbsentMindedTurtle(RaceWindow w, int nbr, int r) {
		super(w, nbr);
		if (r > 100 || r < 0) {
			System.out.println("Välj en tankspriddhetsgrad mellan 0 och 100");
		}
		this.r = r;
	}

	/** Låter sköldpaddan  */
	public void raceStep() {
		int nbr = rand.nextInt(100);
		if (nbr > r) {
			super.raceStep();
		}
	}
	
	/** Returnerar en läsbar rad med sköldpaddans typ och nummer. */
	public String toString() {
		return (super.toString() + " - AbsentMindedTurtle (" + r + "% Frånvarande)"); 
	}

}
