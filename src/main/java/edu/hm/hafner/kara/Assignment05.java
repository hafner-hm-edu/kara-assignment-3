package edu.hm.hafner.kara;

import static de.i8k.karalight.Kara.*;

/**
 * KaraLight: solution of assignment 5.
 *
 * @author Ullrich Hafner
 */
public class Assignment05 {
    /**
     * Entrypoint for Kara: this method is called once if you press the 'Ausführen' button in KaraLight.
     *
     * @param unused
     *         this parameter is not used by KaraLight
     */
    public static void main(final String... unused) {
        drawLineWith4Points();
        drawLineWith6Points();
        drawMiddleLine();
        drawLineWith4Points();
        drawLineWith4Points();
    }

    /**
     * Moves one row down.
     */
    protected static void down() {
        turnRight();
        move();
        turnLeft();
    }

    private static void drawLineWith4Points() {
        draw2Leaves();
        pickLeafAndMove();
        draw2Leaves();
        down();
    }

    protected static void pickLeafAndMove() {
        if (isOnLeaf()) {
            pickLeaf();
        }
        move();
    }

    private static void draw2Leaves() {
        drawLeafAndMove();
        pickLeafAndMove();
        pickLeafAndMove();
        pickLeafAndMove();
        drawLeafAndMove();
    }

    protected static void drawLeafAndMove() {
        if (!isOnLeaf()) {
            putLeaf();
        }
        move();
    }

    private static void drawLineWith6Points() {
        draw2Leaves();
        pickLeafAndMove();
        drawLeafAndMove();
        drawLeafAndMove();
        pickLeafAndMove();
        drawLeafAndMove();
        drawLeafAndMove();

        down();
    }

    private static void drawMiddleLine() {
        drawLeafAndMove();
        drawLeafAndMove();
        drawLeafAndMove();
        drawLeafAndMove();
        drawLeafAndMove();
        pickLeafAndMove();
        drawLeafAndMove();
        pickLeafAndMove();
        drawLeafAndMove();
        pickLeafAndMove();
        drawLeafAndMove();

        down();
    }
}
