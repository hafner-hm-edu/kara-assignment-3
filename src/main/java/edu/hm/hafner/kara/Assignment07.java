package edu.hm.hafner.kara;

import static de.i8k.karalight.Kara.*;

/**
 * KaraLight: solution of assignment 7.
 *
 * @author Ullrich Hafner
 */
public class Assignment07 {
    /**
     * Entrypoint for Kara: this method is called once if you press the 'Ausführen' button in KaraLight.
     *
     * @param unused
     *         this parameter is not used by KaraLight
     */
    public static void main(final String... unused) {
        drawSideAndMoveToNextSide();
        drawSideAndMoveToNextSide();
        drawSideAndMoveToNextSide();
        drawSideAndMoveToNextSide();

        moveToOrigin();
    }

    private static void moveToOrigin() {
        turnAround();
        move();
        turnRight();
        move();
        turnRight();
    }

    private static void drawSideAndMoveToNextSide() {
        drawLine();
        turnAround();
        move();
        turnLeft();
        move();
    }

    private static void turnAround() {
        turnRight();
        turnRight();
    }

    private static void drawLine() {
        while (!isOnLeaf()) {
            putLeaf();
            move();
        }
    }
}
