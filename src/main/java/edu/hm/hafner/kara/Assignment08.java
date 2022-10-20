package edu.hm.hafner.kara;

import static de.i8k.karalight.Kara.*;

/**
 * KaraLight: solution of assignment 8.
 *
 * @author Ullrich Hafner
 */
public class Assignment08 {
    /**
     * Entrypoint for Kara: this method is called once if you press the 'Ausführen' button in KaraLight.
     *
     * @param unused
     *         this parameter is not used by KaraLight
     */
    public static void main(final String... unused) {
        while (!isOnLeaf()) {
            move();
            if (isTreeInFront()) {
                if (isTreeRight()) {
                    turnLeft();
                    moveWhileTreeOnRight();
                    goRight();
                }
                else {
                    turnRight();
                    moveWhileTreeOnLeftSide();
                    if (isTreeInFront()) {
                        turnAround();
                        moveWhileTreeOnRight();
                        goRight();
                    }
                    else {
                        goLeft();
                    }
                }
            }
        }
        pickLeaf();
    }

    private static void moveWhileTreeOnRight() {
        while (isTreeRight() && !isTreeInFront()) {
            move();
        }
    }

    private static void moveWhileTreeOnLeftSide() {
        while (isTreeLeft() && !isTreeInFront()) {
            move();
        }
    }

    private static void goLeft() {
        turnLeft();
        move();
    }

    private static void goRight() {
        turnRight();
        move();
    }

    private static void turnAround() {
        turnLeft();
        turnLeft();
    }
}
