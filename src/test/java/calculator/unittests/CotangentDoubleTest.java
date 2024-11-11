package calculator.unittests;

import calculator.BaseTest;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CotangentDoubleTest extends BaseTest {
        @ParameterizedTest
        @CsvSource({
                "0.5663227065480905, 0.6420926159343308",
                "-0.5663227065480905, -0.6420926159343308",
                "0.9498737676188023, 1.830487721712452",
                "-0.9498737676188023, -1.830487721712452"

        })
        public void testCotangentDouble(double expected, double a) {
            assertEquals(expected, calculator.ctg(a));
        }
}
