package calculator.unittests;

import calculator.BaseTest;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultDoubleTest extends BaseTest {
    @ParameterizedTest
    @CsvSource({
            "88.0, 35.5, 2.5",
            "7.0, -6.3, -1.25",
            "-198.0, 22.0, -9.0",
            "0.0, 0.0, 47.93",
            "0.0, 0.0, 0.0"
    })
    public void testMultDouble(double expected, double a, double b) {
        assertEquals(expected, calculator.mult(a, b));
    }
}
