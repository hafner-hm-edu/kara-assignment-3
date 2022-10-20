package edu.hm.hafner.kara;

import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import de.i8k.karalight.world.World;

class Assignment11Test extends AbstractKaraTest {
    @MethodSource
    @ParameterizedTest(name = "{index} => {0} ({1})")
    @DisplayName("Ermittle die meisten Blätter pro Zeile")
    @Timeout(value = 2, threadMode = ThreadMode.SEPARATE_THREAD)
    void shouldSolveAssignment(final World start, final World expected) {
        verifyAssignment(start, Assignment11::main, expected);
    }

    static Stream<Arguments> shouldSolveAssignment() {
        return createStreamOfWorlds("11-Absteigend", "11-Alles-Voll", "11-Aufsteigend",
                "11-Die-Leere", "11-Gleichstand", "11-Leere-Linie", "11-Minimum");
    }
}

