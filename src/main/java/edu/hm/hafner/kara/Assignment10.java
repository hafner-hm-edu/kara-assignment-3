package edu.hm.hafner.kara;

import static de.i8k.karalight.Kara.*;

/**
 * KaraLight: solution of assignment 10.
 *
 * @author Ullrich Hafner
 */
public class Assignment10 {
    /**
     * Entrypoint for Kara: this method is called once if you press the 'Ausführen' button in KaraLight.
     *
     * @param unused
     *         this parameter is not used by KaraLight
     */
    public static void main(final String... unused) {
        int length = 0;

        putLeaf();
        do {
            move();
            length++;
        } while (!isOnLeaf());
        pickLeaf();

        for (var y = 0; y < (length + 1) / 2; y++) {
            for (var x = 0; x < y; x++) {
                move();
            }
            for (var x = y; x < length - y; x++) {
                if (x % 2 != (y + 1) % 2) {
                    putLeaf();
                }
                move();
            }
            for (var x = length - y; x < length; x++) {
                move();
            }
            down();
        }

    }

    static void down() {
        turnRight();
        move();
        turnLeft();
    }
}
