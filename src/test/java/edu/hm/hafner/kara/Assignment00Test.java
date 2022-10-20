package edu.hm.hafner.kara;

import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import de.i8k.karalight.world.World;

class Assignment00Test extends AbstractKaraTest {
    @MethodSource
    @ParameterizedTest(name = "{index} => {0} ({1})")
    @DisplayName("Zeichne einen Diamanten")
    void shouldSolveAssignment(final World start, final World expected) {
        verifyAssignment(start, Assignment00::main, expected);
    }

    static Stream<Arguments> shouldSolveAssignment() {
        return createStreamOfWorlds("00-3x3", "00-5x5", "00-25x25");
    }
}

