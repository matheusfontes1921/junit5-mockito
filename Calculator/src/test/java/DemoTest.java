import org.example.Calculator;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

//Method name pattern -> test<Method or System Under test>_<Condition>_<ExpectedResult>
@DisplayName("Test Math operations in Calculator class")
public class DemoTest {
    @BeforeAll
    static void setUp(){
        System.out.println("@BeforeAll");
    }
    @AfterAll
    static void cleanUp() {
        System.out.println("@AfterAll");
    }
    @BeforeEach
    void setUpEach(){
        Calculator calc = new Calculator();
        System.out.println("@BeforeEach");
    }
    @AfterEach
    void afterEachTestMethod(){
        System.out.printf("@AfterEach");
    }

    @DisplayName("6/3 = 3")
    @Test
    void testDivision_WhenSixIsDividedByThree_ShouldReturnTwo() {
        ///AAA (Arrange, Act, Assert)
        //Arrange (Initialize the variables) - GIVEN
        Calculator calculator = new Calculator();
        int a = 6;
        int b = 3;
        int expectedResult = 2;
        //Act (Invoke your method) - WHEN
        int value = calculator.division(a,b);
        //Assert (Validate the value) - THEN
        assertEquals(expectedResult, value, "6/3 is 2. The result is wrong!"); /* it's a good practice to always insert a mesage in assert
        the message will only be displayed if the test fails */
    }
    @Test
    @DisplayName("Division by zero")
    void testDivision_WhenDividendIsDividedByZero_ShouldThrowArithmeticException(){
        System.out.println("teste");
    }
    @Test
    @DisplayName("8-6 = 2")
    void testSubtraction(){
        //Arrange - GIVEN
        Calculator calculator = new Calculator();
        int a = 8;
        int b = 6;
        int expectValue = 2;
        //Act - WHEN
        int value = calculator.subtraction(a,b);
        //Assert - THEN
        assertEquals(expectValue,value,()-> "Errado. O valor correto não é esse, uma vez que " + a + " - " + b + " equivale a " + expectValue);
    }
}
