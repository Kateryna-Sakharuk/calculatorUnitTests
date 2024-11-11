package calculator.unittests;

import calculator.BaseTest;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultLongTest extends BaseTest {

        @ParameterizedTest
        @CsvSource({
                "49, 7, 7",
                "2275, -35, -65",
                "-198, 22, -9",
                "0, 0, 47",
                "0, 0, 0"
        })
        public void testMultLong(long expected, long a, long b) {
            assertEquals(expected, calculator.mult(a, b));
        }
}
