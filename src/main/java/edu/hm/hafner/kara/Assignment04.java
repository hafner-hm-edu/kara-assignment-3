package edu.hm.hafner.kara;

import static de.i8k.karalight.Kara.*;

/**
 * KaraLight: solution of assignment 4.
 *
 * @author Ullrich Hafner
 */
public class Assignment04 {
    /**
     * Entrypoint for Kara: this method is called once if you press the 'Ausführen' button in KaraLight.
     *
     * @param unused
     *         this parameter is not used by KaraLight
     */
    public static void main(final String... unused) {
        drawVerticalHalf();
        drawVerticalHalf();
    }

    private static void drawVerticalHalf() {
        drawLine();
        drawLine();
    }

    private static void drawLine() {
        drawQuarter();
        drawQuarter();
        moveDown();
        move();
    }

    private static void drawQuarter() {
        putLeaf();
        move();
        move();
    }

    private static void moveDown() {
        turnRight();
        move();
        turnLeft();
    }
}
