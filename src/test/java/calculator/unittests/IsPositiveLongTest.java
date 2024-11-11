package calculator.unittests;

import calculator.BaseTest;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IsPositiveLongTest extends BaseTest {
    @ParameterizedTest
    @CsvSource({
            "true, 15",
            "false, 0",
            "false, -1"

    })
    public void testIsPositiveLong(boolean expected, long a) {
        assertEquals(expected, calculator.isPositive(a));
    }
}
