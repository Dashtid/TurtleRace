package turtles;

import java.awt.*;
import java.util.Random;
import race.RaceWindow;

/**
 * Base class for all race turtles.
 */
public class RaceTurtle {
    private static final int MAX_STEP = 6; // Maximum step size
    private int number;
    private int x, y;
    private boolean penDown = true;
    protected static final Random rand = new Random(); // Shared Random instance
    private RaceWindow window;

    public RaceTurtle(RaceWindow window, int number) {
        this.window = window;
        this.number = number;
        this.x = RaceWindow.getStartXPos(number);
        this.y = RaceWindow.getStartYPos(number);
    }

    public void raceStep() {
        int step = rand.nextInt(MAX_STEP) + 1; // Use constant for max step
        if (penDown) {
            Graphics g = window.getGraphics();
            if (g != null) { // Ensure Graphics object is not null
                g.setColor(Color.BLUE);
                g.drawLine(x, y, x + step, y);
            }
        }
        x += step;
    }

    public int getX() {
        return x;
    }

    @Override
    public String toString() {
        return "Number " + number;
    }

    public void penDown() {
        penDown = true;
    }

    public void penUp() {
        penDown = false;
    }
}