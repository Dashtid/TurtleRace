import java.util.Random;

public class RaceTurtle extends Turtle {
	private int nbr;
	private static Random rand = new Random();

	/**
	 * Skapar en sköldpadda som ska springa i fönstret w och som har ett startnummer
	 * nbr. Sköldpaddan startar med pennan nere och nosen vänd åt höger.
	 */
	public RaceTurtle(RaceWindow w, int nbr) {
		super(w, RaceWindow.getStartXPos(nbr), RaceWindow.getStartYPos(nbr));
		this.penDown();
		super.left(-90);
		this.nbr = nbr;
	}

	/**
	 * Låter sköldpaddan gå framåt ett steg. Stegets längd ges av ett slumptal
	 * (heltal) mellan 1 och 6.
	 */
	public void raceStep() {
		int nbr = rand.nextInt(6) + 1;
		super.forward(nbr);
	}

	/**
	 * Returnerar en läsbar representation av denna RaceTurtle, på formen "Nummer x"
	 * där x är sköldpaddans startnummer.
	 */
	public String toString() {
		return ("Nummer " + nbr);
	}

}