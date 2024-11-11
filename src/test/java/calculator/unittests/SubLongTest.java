package calculator.unittests;

import calculator.BaseTest;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SubLongTest extends BaseTest {
    @ParameterizedTest
    @CsvSource({
            "34, 93, 59",
            "-129, -175, -46",
            "31, 22, -9",
            "0, 0, 0"
    })
    public void testSubLong(long expected, long a, long b) {
        assertEquals(expected, calculator.sub(a, b));
    }
}
