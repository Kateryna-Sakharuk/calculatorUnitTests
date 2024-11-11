package calculator.unittests;

import calculator.BaseTest;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IsNegativeLongTest extends BaseTest {
    @ParameterizedTest
    @CsvSource({
            "false, 15",
            "false, 0",
            "true, -1"
    })
    public void testIsNegativeLong(boolean expected, long a) {
        assertEquals(expected, calculator.isNegative(a));
    }
}
