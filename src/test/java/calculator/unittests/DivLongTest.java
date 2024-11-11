package calculator.unittests;

import calculator.BaseTest;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DivLongTest extends BaseTest {
    @ParameterizedTest
    @CsvSource({
            "7, 49, 7",
            "35, -2275, -65",
            "-9, -198, 22",
            "0, 0, 47"
    })
    public void testDivLong(long expected, long a, long b) {
        assertEquals(expected, calculator.div(a, b));
    }
}
