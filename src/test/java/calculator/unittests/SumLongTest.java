package calculator.unittests;

import calculator.BaseTest;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumLongTest extends BaseTest {
    @ParameterizedTest
    @CsvSource({
            "3, 3, 0",
            "-5, -2, -3",
            "4, -9, 13"
    })
    public void testSumLong(long expected, long a, long b) {
        assertEquals(expected, calculator.sum(a, b));
    }
}
