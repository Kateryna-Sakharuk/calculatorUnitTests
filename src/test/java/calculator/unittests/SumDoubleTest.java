package calculator.unittests;

import calculator.BaseTest;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumDoubleTest extends BaseTest {
    @ParameterizedTest
    @CsvSource({
            "8.0, 3.2, 4.8",
            "-124.5, -73.8, -50.7",
            "13.0, 22.0, -9.0",
            "0.0, 0.0, 0.0"
    })
    public void testSumDouble(double expected, double a, double b) {
        assertEquals(expected, calculator.sum(a, b));
    }
}
