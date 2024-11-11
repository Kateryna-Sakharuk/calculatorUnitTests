package calculator.unittests;

import calculator.BaseTest;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SubDoubleTest extends BaseTest {
    @ParameterizedTest
    @CsvSource({
            "34.0, 93.0, 59.0",
            "-129.0, -175.0, -46,0",
            "31.0, 22.0, -9.0",
            "0.0, 0.0, 0.0"
    })
    public void testSubDouble(double expected, double a, double b) {
        assertEquals(expected, calculator.sub(a, b));
    }

}
