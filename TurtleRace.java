import java.util.ArrayList;

public class TurtleRace {
    public static void main(String[] args) {
        ArrayList<RaceTurtle> turtles = new ArrayList<>();
        ArrayList<RaceTurtle> finishedTurtles = new ArrayList<>();
        RaceWindow window = new RaceWindow();

        // Dynamically create turtles
        turtles.add(new MoleTurtle(window, 1));
        turtles.add(new AbsentMindedTurtle(window, 2, 45));
        turtles.add(new AbsentMindedTurtle(window, 3, 35));
        turtles.add(new DizzyTurtle(window, 4, 3));
        turtles.add(new MoleTurtle(window, 5));
        turtles.add(new MoleTurtle(window, 6));
        turtles.add(new AbsentMindedTurtle(window, 7, 71));
        turtles.add(new DizzyTurtle(window, 8, 5));

        // Display starting positions
        window.repaint();
        System.out.println("Click the mouse to start the race!");
        window.waitForMouseClick();

        // Race logic
        while (!turtles.isEmpty()) {
            ArrayList<RaceTurtle> toRemove = new ArrayList<>();
            for (RaceTurtle turtle : turtles) {
                turtle.raceStep();
                RaceWindow.delay(2);
                if (turtle.getX() >= RaceWindow.X_END_POS) {
                    finishedTurtles.add(turtle);
                    toRemove.add(turtle);
                }
            }
            turtles.removeAll(toRemove); // Remove turtles after iteration
        }

        // Display race results
        System.out.println("Race Results:");
        for (int i = 0; i < finishedTurtles.size(); i++) {
            System.out.println("Position " + (i + 1) + ": " + finishedTurtles.get(i));
        }
        if (finishedTurtles.size() < 3) {
            System.out.println("Not enough turtles finished the race to display top 3 positions.");
        }
    }
}
