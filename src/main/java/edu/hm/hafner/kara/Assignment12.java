package edu.hm.hafner.kara;

import static de.i8k.karalight.Kara.*;

/**
 * KaraLight: solution of assignment 12.
 *
 * @author Ullrich Hafner
 */
public class Assignment12 {
    /**
     * Entrypoint for Kara: this method is called once if you press the 'Ausführen' button in KaraLight.
     *
     * @param unused
     *         this parameter is not used by KaraLight
     */
    public static void main(final String... unused) {
        int obstacleCounter = 0;

        boolean isInSecondColumn = false;
        while (!isOnLeaf()) {
            obstacleCounter += countObstaclesInCurrentRow();

            turnRight();
            if (isInSecondColumn) {
                moveToFirstColumn();
                isInSecondColumn = false;
            }
            else if (isObstacleInFront()) {
                moveToSecondColumn();
                isInSecondColumn = true;
            }
            else {
                down();
                isInSecondColumn = false;
            }
        }

        say(String.format("Number of obstacles: %d", obstacleCounter));
    }

    private static int countObstaclesInCurrentRow() {
        int obstactleCounter = 0;
        while (!isOnLeaf()) {
            putLeaf();
            if (isObstacleInFront()) {
                obstactleCounter++;
                walkAroundObstacle();
            }
            else {
                move();
            }
        }
        return obstactleCounter;
    }

    private static boolean isObstacleInFront() {
        return isTreeInFront() || isMushroomInFront();
    }

    private static void moveToFirstColumn() {
        down();
        turnAround();
        move();
        turnAround();
    }

    private static void moveToSecondColumn() {
        turnLeft();
        move();
        turnRight();
        down();
    }

    private static void turnAround() {
        turnRight();
        turnRight();
    }

    static void down() {
        move();
        turnLeft();
    }

    static void walkAroundObstacle() {
        turnRight();
        move();
        turnLeft();
        move();
        move();
        turnLeft();
        move();
        turnRight();
    }
}
