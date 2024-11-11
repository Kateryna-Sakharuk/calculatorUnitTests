package calculator.unittests;

import calculator.BaseTest;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CosineDoubleTest extends BaseTest {
        @ParameterizedTest
        @CsvSource({
                "0.8414709848078965, 1.0",
                "1.0, 1.5707963267948966",
                "0.0, 0.0"

        })
        public void testCosineDouble(double expected, double a) {
            assertEquals(expected, calculator.cos(a));
        }
}
