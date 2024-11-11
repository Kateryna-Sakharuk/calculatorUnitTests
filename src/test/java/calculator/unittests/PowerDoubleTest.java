package calculator.unittests;

import calculator.BaseTest;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PowerDoubleTest extends BaseTest {
    @ParameterizedTest
    @CsvSource({
            "1267.3064795250527, 35.5992483, 2.253641",
            "0.008892905576490345, -3.25641, -3.56214",
            "1.0, 1.283204, 0.0"
    })
    public void testPowDouble(double expected, double a, double b) {
        assertEquals(expected, calculator.pow(a, b));
    }
}
