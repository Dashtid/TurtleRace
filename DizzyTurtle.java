import java.util.Random;

public class DizzyTurtle extends RaceTurtle {
    private int dizzinessLevel; // Dizziness level (1 to 5)

    public DizzyTurtle(RaceWindow window, int number, int dizzinessLevel) {
        super(window, number);
        if (dizzinessLevel < 1 || dizzinessLevel > 5) {
            throw new IllegalArgumentException("Dizziness level must be between 1 and 5.");
        }
        this.dizzinessLevel = dizzinessLevel;
    }

    @Override
    public void raceStep() {
        int randomTurn = rand.nextInt(dizzinessLevel) - 2; // Use shared Random instance from RaceTurtle
        super.left(randomTurn * 10);
        super.raceStep();
        super.left(-randomTurn * 10);
    }

    @Override
    public String toString() {
        return super.toString() + " - DizzyTurtle (Dizziness: " + dizzinessLevel + ")";
    }
}