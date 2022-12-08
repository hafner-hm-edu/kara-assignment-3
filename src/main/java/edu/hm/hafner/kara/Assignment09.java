package edu.hm.hafner.kara;

import static de.i8k.karalight.Kara.*;

/**
 * KaraLight: solution of assignment 9.
 *
 * @author Ullrich Hafner
 */
public class Assignment09 {
    /**
     * Entrypoint for Kara: this method is called once if you press the 'Ausführen' button in KaraLight.
     *
     * @param unused
     *         this parameter is not used by KaraLight
     */
    public static void main(final String... unused) {
        while (isOnLeaf()) {
            pickLeaf();

            int distance = computeDistanceToTree();

            moveBy(distance);
            turnAround();
            moveBy(distance);
            turnRight();
            move();
        }
        restoreLeaves();
    }

    private static int computeDistanceToTree() {
        int distance = 0;

        turnLeft();
        while (!isTreeInFront()) {
            move();
            distance++;
        }
        turnAround();
        moveBy(distance);
        return distance;
    }

    private static void restoreLeaves() {
        while (!isOnLeaf()) {
            putLeaf();
            move();
        }
    }

    private static void turnAround() {
        turnRight();
        turnRight();
    }

    private static void moveBy(final int distance) {
        for (int y = 0; y < distance; y++) {
            move();
        }
    }
}
