import java.util.Random;

public class MoleTurtle extends RaceTurtle {
	private static Random rand = new Random();

	public MoleTurtle(RaceWindow w, int nbr) {
		super(w, nbr);
	}

	/** Får sköldpaddan att lyfta pennan slumpmässigt, dvs. "gå under jorden". */
	public void raceStep() {
		int nbr = rand.nextInt(2);
		if (nbr == 0) {
			super.penDown();
		} else {
			super.penUp();
		}
		super.raceStep();
	}
	
	/** Returnerar en läsbar rad med sköldpaddans typ och nummer. */
	public String toString() {
		return (super.toString() + " - MoleTurtle" );
	}
}