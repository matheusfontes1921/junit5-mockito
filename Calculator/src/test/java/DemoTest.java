import org.example.Calculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//Method name pattern -> test<Method or System Under test>_<Condition>_<ExpectedResult>
@DisplayName("Test Math operations in Calculator class")
public class DemoTest {
    @Test
    @DisplayName("6/3 = 3")
    void testDivision_WhenSixIsDividedByThree_ShouldReturnTwo() {
        Calculator calculate = new Calculator();
        int value = calculate.division(6,3);
        assertEquals(2, value, "6/3 is 2. The result is wrong!"); /* it's a good practice to always insert a mesage in assert
        the message will only be displayed if the test fails */
    }
    @Test
    @DisplayName("Division by zero")
    void testDivision_WhenDividendIsDividedByZero_ShouldThrowArithmeticException(){

    }
    @Test
    @DisplayName("8-6 = 2")
    void testSubtraction(){
        Calculator calculate = new Calculator();
        int a = 8;
        int b = 6;
        int expectValue = 2;
        int value = calculate.subtraction(a,b);
        assertEquals(expectValue,value,()-> "Errado. O valor correto não é esse, uma vez que " + a + " - " + b + " equivale a " + expectValue);
    }
}
