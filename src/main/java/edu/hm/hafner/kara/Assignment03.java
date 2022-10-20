package edu.hm.hafner.kara;

import static de.i8k.karalight.Kara.*;

/**
 * KaraLight: solution of assignment 3.
 *
 * @author Ullrich Hafner
 */
public class Assignment03 {
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
        move();
        draw2Leaves();
        down();
    }

    private static void draw2Leaves() {
        drawLeafAndMove();
        move();
        move();
        move();
        drawLeafAndMove();
    }

    protected static void drawLeafAndMove() {
        putLeaf();
        move();
    }

    private static void drawLineWith6Points() {
        draw2Leaves();
        move();
        drawLeafAndMove();
        drawLeafAndMove();
        move();
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
        move();
        drawLeafAndMove();
        move();
        drawLeafAndMove();
        move();
        drawLeafAndMove();

        down();
    }
}
