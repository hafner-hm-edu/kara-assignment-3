package edu.hm.hafner.kara;

import static de.i8k.karalight.Kara.*;

/**
 * KaraLight: solution of assignment 11.
 *
 * @author Ullrich Hafner
 */
public class Assignment11 {
    /**
     * Entrypoint for Kara: this method is called once if you press the 'Ausführen' button in KaraLight.
     *
     * @param unused
     *         this parameter is not used by KaraLight
     */
    public static void main(final String... unused) {
        int maxCounter = -1;
        int maxLine = 1;

        int line = 0;
        boolean stop = false;
        do {
            int counter = countLeaves();

            moveBack();

            if (counter > maxCounter) {
                maxCounter = counter;
                maxLine = line;
            }

            if (isTreeRight()) {
                stop = true;
            }
            else {
                turnRight();
                move();
                turnLeft();
                line++;
            }
        } while (!stop);

        turnLeft();
        for (var y = line; y > maxLine; y--) {
            move();
        }
        turnRight();
        while (!isMushroomInFront()) {
            move();
        }
        move();

        moveBack();

        turnLeft();
        while (!isTreeInFront()) {
            move();
        }
        turnRight();
    }

    private static int countLeaves() {
        int counter = 0;

        boolean isAtEnd = false;
        while (!isAtEnd) {
            if (isOnLeaf()) {
                counter++;
            }
            if (isMushroomInFront()) {
                isAtEnd = true;
            }
            else {
                move();
            }
        }

        return counter;
    }

    static void moveBack() {
        turnLeft();
        turnLeft();
        while (!isTreeInFront()) {
            move();
        }
        turnLeft();
        turnLeft();
    }
}
