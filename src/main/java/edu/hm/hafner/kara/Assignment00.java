package edu.hm.hafner.kara;

import static de.i8k.karalight.Kara.*;

/**
 * KaraLight: solution of assignment 0.
 *
 * @author Ullrich Hafner
 */
public class Assignment00 {
    /**
     * Entrypoint for Kara: this method is called once if you press the 'Ausführen' button in KaraLight.
     *
     * @param unused
     *         this parameter is not used by KaraLight
     */
    public static void main(final String... unused) {
        int width = computeWidth();
        int half = width / 2;

        for (int line = 0; line < width; line++) {
            int limit = computeLimit(width, line);

            for (int column = 0; column < width; column++) {
                if (column >= half - limit + 1
                        && column < half + limit) {
                    putLeaf();
                }
                move();
            }

            moveDown();
        }
    }

    private static int computeLimit(final int width, final int line) {
        if (line > width / 2) {
            return width - line;
        }
        else {
            return line + 1;
        }
    }

    private static int computeWidth() {
        int width = 0;

        putLeaf();
        do {
            move();
            width++;
        } while (!isOnLeaf());
        pickLeaf();

        return width;
    }

    private static void moveDown() {
        turnRight();
        move();
        turnLeft();
    }
}
