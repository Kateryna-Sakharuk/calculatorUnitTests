package calculator.unittests;

import calculator.BaseTest;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquareRootDoubleTest extends BaseTest {
    @ParameterizedTest
    @CsvSource({
            "4.0, 16.0",
            "5.0, -25.0",
            "0.0, 0.0"
    })
    public void testSquareRootDouble(double expected, double a) {
        assertEquals(expected, calculator.sqrt(a));
    }
}
