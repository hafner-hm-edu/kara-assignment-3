package edu.hm.hafner.kara;

import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import de.i8k.karalight.world.World;

class Assignment07Test extends AbstractKaraTest {
    @MethodSource
    @ParameterizedTest(name = "{index} => {0} ({1})")
    @DisplayName("Male Zäune um die beliebige Welt")
    @Timeout(value = 2, threadMode = ThreadMode.SEPARATE_THREAD)
    void shouldSolveAssignment(final World start, final World expected) {
        verifyAssignment(start, Assignment07::main, expected);
    }

    static Stream<Arguments> shouldSolveAssignment() {
        return createStreamOfWorlds("07-2x2", "07-3x3", "07-4x7", "07-7x4");
    }
}

