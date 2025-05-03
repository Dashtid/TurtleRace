package turtles;

import race.RaceWindow;

/**
 * Represents a turtle that occasionally forgets to move forward based on its absent-mindedness level.
 */
public class AbsentMindedTurtle extends RaceTurtle {
    private static final int MIN_ABSENT_MINDEDNESS = 0;
    private static final int MAX_ABSENT_MINDEDNESS = 100;

    private int absentMindedness; // Absent-mindedness level (0 to 100)

    public AbsentMindedTurtle(RaceWindow window, int number, int absentMindedness) {
        super(window, number);
        if (absentMindedness < MIN_ABSENT_MINDEDNESS || absentMindedness > MAX_ABSENT_MINDEDNESS) {
            throw new IllegalArgumentException("Absent-mindedness must be between " + MIN_ABSENT_MINDEDNESS + " and " + MAX_ABSENT_MINDEDNESS + ".");
        }
        this.absentMindedness = absentMindedness;
    }

    @Override
    public void raceStep() {
        if (rand.nextInt(MAX_ABSENT_MINDEDNESS) > absentMindedness) { // Use shared Random instance from RaceTurtle
            super.raceStep();
        }
    }

    @Override
    public String toString() {
        return super.toString() + " - AbsentMindedTurtle (" + absentMindedness + "% Absent)";
    }
}
