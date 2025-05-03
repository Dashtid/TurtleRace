package turtles;

import race.RaceWindow;

/**
 * Represents a turtle that randomly turns left or right during the race based on its dizziness level.
 */
public class DizzyTurtle extends RaceTurtle {
    private static final int MIN_DIZZINESS_LEVEL = 1;
    private static final int MAX_DIZZINESS_LEVEL = 5;

    private int dizzinessLevel; // Dizziness level (1 to 5)

    public DizzyTurtle(RaceWindow window, int number, int dizzinessLevel) {
        super(window, number);
        if (dizzinessLevel < MIN_DIZZINESS_LEVEL || dizzinessLevel > MAX_DIZZINESS_LEVEL) {
            throw new IllegalArgumentException("Dizziness level must be between " + MIN_DIZZINESS_LEVEL + " and " + MAX_DIZZINESS_LEVEL + ".");
        }
        this.dizzinessLevel = dizzinessLevel;
    }

    @Override
    public void raceStep() {
        int randomTurn = rand.nextInt(dizzinessLevel) - (dizzinessLevel / 2); // Random turn between -dizzinessLevel/2 and +dizzinessLevel/2
        if (randomTurn != 0) {
            System.out.println("DizzyTurtle turns " + (randomTurn > 0 ? "right" : "left") + " by " + Math.abs(randomTurn) + " degrees.");
        }
        super.raceStep();
    }

    @Override
    public String toString() {
        return super.toString() + " - DizzyTurtle (Dizziness: " + dizzinessLevel + ")";
    }
}