package turtles;
public class MoleTurtle extends RaceTurtle {

    public MoleTurtle(RaceWindow window, int number) {
        super(window, number);
    }

    @Override
    public void raceStep() {
        if (rand.nextBoolean()) { // Use shared Random instance from RaceTurtle
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