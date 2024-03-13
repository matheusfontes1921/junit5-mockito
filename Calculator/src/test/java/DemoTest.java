import org.example.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DemoTest {
    @Test
    void testDivision() {
        Calculator calculate = new Calculator();
        int value = calculate.division(6,3);
        assertEquals(2, value, "6/2 is 2. Tne result is wrong!"); /* it's a good practice to always insert a mesage in assert
        the message will only be displayed if the test fails */
    }
}
