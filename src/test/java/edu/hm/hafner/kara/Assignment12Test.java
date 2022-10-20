package edu.hm.hafner.kara;

import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import de.i8k.karalight.world.World;

import static org.assertj.core.api.Assertions.*;

class Assignment12Test extends AbstractKaraTest {
    @MethodSource
    @ParameterizedTest(name = "{index} => Welt {0} hat {1} Hindernisse")
    @DisplayName("Ermittle die meisten Blätter pro Zeile")
    @Timeout(value = 2, threadMode = ThreadMode.SEPARATE_THREAD)
    void shouldSolveAssignment(final World start, final int expectedObstacles) {
        executeHeadlessWithWorld(start);

        Assignment12.main();

        assertThat(start.deliverMessages())
                .hasSize(1)
                .element(0).asString()
                .as("Kara hat nicht die korrekte Anzahl %d mit say() ausgegeben", expectedObstacles)
                .matches("[^0-9]*" + expectedObstacles + "[^0-9]*");
    }

    static Stream<Arguments> shouldSolveAssignment() {
        return Stream.of(
                Arguments.of("Assignment12-Minimum.world", 1),
                Arguments.of("Assignment12-Ecken.world", 2),
                Arguments.of("Assignment12-Baum-voraus.world", 3),
                Arguments.of("Assignment12-Slalom.world", 12)

        );
    }
}

