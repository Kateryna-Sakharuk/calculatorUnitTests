package calculator.unittests;

import calculator.BaseTest;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DivDoubleTest extends BaseTest {
    @ParameterizedTest
    @CsvSource({
            "7.0, 49.0, 7.0",
            "35.0, -2275.0, -65.0",
            "-9.0, -198.0, 22.0",
            "0.0, 0.0, 47.93"
    })
    public void testDivDouble(double expected, double a, double b) {
        assertEquals(expected, calculator.div(a, b));
    }
}
