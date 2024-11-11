package calculator.unittests;

import calculator.BaseTest;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TangentDoubleTest extends BaseTest {
    @ParameterizedTest
    @CsvSource({
            "1.0, 1.5574077246549023",
            "1.0, -3.380515006246586",

    })
    public void testTangentDouble(double expected, double a) {
        assertEquals(expected, calculator.tg(a));
    }
}
