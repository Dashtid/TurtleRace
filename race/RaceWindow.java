package race;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Represents the race window where the turtles race.
 */
public class RaceWindow extends JFrame {
    public static final int X_START_POS = 100;
    public static final int X_END_POS = 700;
    public static final int Y_LINE_START = 100;
    public static final int Y_LINE_END = 280;

    private boolean mouseClicked = false;

    public RaceWindow() {
        super("Race Window");
        setSize(800, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        // Add mouse listener to detect clicks
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                mouseClicked = true;
            }
        });
    }

    public void drawStartAndFinishLines(Graphics g) {
        g.setColor(Color.BLACK);

        // Draw starting positions
        for (int i = 1; i <= 8; i++) {
            g.drawString(String.valueOf(i), X_START_POS - 20, Y_LINE_START + i * 20);
        }

        // Draw start line
        g.drawLine(X_START_POS, Y_LINE_START, X_START_POS, Y_LINE_END);

        // Draw finish line
        g.drawLine(X_END_POS, Y_LINE_START, X_END_POS, Y_LINE_END);
    }

    public void waitForMouseClick() {
        while (!mouseClicked) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        mouseClicked = false; // Reset for future use
    }

    public static int getStartXPos(int startNbr) {
        return X_START_POS;
    }

    public static int getStartYPos(int startNbr) {
        return Y_LINE_START + startNbr * 20;
    }

    public static void delay(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}