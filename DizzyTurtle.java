import java.util.Random;

public class DizzyTurtle extends RaceTurtle {
	private int r; // Sköldpaddans yrselgrad (från 1 till 5).
	private static Random rand = new Random();

	public DizzyTurtle(RaceWindow w, int nbr, int r) {
		super(w, nbr);
		// ngt felmeddelande om r < 1 || r > 5
		this.r = r;
	}

	/**  raceStep */
	public void raceStep() {
		int nbr = rand.nextInt(r) - 2;
		super.left(nbr * 10);
		super.raceStep();
		super.left(nbr * -10);
	}

/** Returnerar en läsbar rad med sköldpaddans typ och nummer. */
	public String toString() {
		return (super.toString() + " - DizzyTurtle (Yrsel: " + r + ")"); } }