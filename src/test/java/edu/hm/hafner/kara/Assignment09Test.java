package edu.hm.hafner.kara;

import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import de.i8k.karalight.world.World;

class Assignment09Test extends AbstractKaraTest {
    @MethodSource
    @ParameterizedTest(name = "{index} => {0} ({1})")
    @DisplayName("Spiegle das Muster über den Blättern")
    @Timeout(value = 2, threadMode = ThreadMode.SEPARATE_THREAD)
    void shouldSolveAssignment(final World start, final World expected) {
        verifyAssignment(start, Assignment09::main, expected);
    }

    static Stream<Arguments> shouldSolveAssignment() {
        return createStreamOfWorlds("09-Kreis", "09-Kreuz", "09-Linie");
    }
}

