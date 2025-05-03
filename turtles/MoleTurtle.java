package turtles;

import race.RaceWindow;

/**
 * Represents a turtle that randomly decides whether to draw a line or not during its race step.
 */
public class MoleTurtle extends RaceTurtle {

    public MoleTurtle(RaceWindow window, int number) {
        super(window, number);
    }

    @Override
    public void raceStep() {
        if (rand.nextBoolean()) { // Randomly decide to draw or not
            super.penDown();
        } else {
            super.penUp();
        }
        super.raceStep();
    }

    @Override
    public String toString() {
        return super.toString() + " - MoleTurtle";
    }
}