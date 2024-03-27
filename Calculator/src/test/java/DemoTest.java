import org.example.Calculator;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;
import org.junit.jupiter.api.BeforeEach;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

//Method name pattern -> test<Method or System Under test>_<Condition>_<ExpectedResult>
@DisplayName("Test Math operations in Calculator class")
public class DemoTest {
    Calculator calc;
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
        calc = new Calculator();
        //System.out.println("@BeforeEach");
    }
    @AfterEach
    void afterEachTestMethod(){
        //System.out.println("@AfterEach");
    }
    @DisplayName("6/3 = 3")
    @Test
    void testDivision_WhenSixIsDividedByThree_ShouldReturnTwo() {
        ///AAA (Arrange, Act, Assert)
        //Arrange (Initialize the variables) - GIVEN
        int a = 6;
        int b = 3;
        int expectedResult = 2;
        //Act (Invoke your method) - WHEN
        int value = calc.division(a,b);
        //Assert (Validate the value) - THEN
        assertEquals(expectedResult, value, "6/3 is 2. The result is wrong!"); /* it's a good practice to always insert a mesage in assert
        the message will only be displayed if the test fails */
    }
    //@Disabled("TODO: Still need to work on it")
    @Test
    @DisplayName("Division by zero")
    void testDivision_WhenDividendIsDividedByZero_ShouldThrowArithmeticException(){
        //Arrange
        int a = 4;
        int b = 0;
        String expectedExceptionMessage = "/ by zero"; //é a mensagem da exceção
        //Act & Assert
        ArithmeticException actualException = assertThrows(ArithmeticException.class,()->{
            //Act
            calc.division(a,b);
        }, "Division by Zero should throw arithmetic exception");
        //Assert
        assertEquals(expectedExceptionMessage, actualException.getMessage(),"Unexpected exception method");
    }
    @ParameterizedTest
    @ValueSource(strings = {"Matheus", "Gabriel", "Cláudia", "Renato"})
    void valueSourceDemonstration(String firstName){
        System.out.println(firstName);
        assertNotNull(firstName);
    }
    @DisplayName("Test subtraction")
    @ParameterizedTest
    //@MethodSource
    //@CsvSource( {"8,6,2", "21,5,16", "33,5,28"} )
    @CsvFileSource(resources = "/integerSubtraction.csv")
    void testSubtraction(int a, int b, int expectedValue){
        //Act - WHEN
        int value = calc.subtraction(a,b);
        //Assert - THEN
        assertEquals(expectedValue,value,()-> "Errado. O valor correto não é esse, uma vez que " + a + " - " + b + " equivale a " + expectedValue);
    }
    @Test
    void testAddition(){
        int a = 6;
        int b = 1;
        int expectedValue = 7;
        int value = calc.addition(a,b);
        assertEquals(expectedValue,value,"Erro");
    }
    @Test
    void testSubtraction(){
        int a = 6;
        int b = 1;
        int expectedValue = 5;
        int value = calc.subtraction(a,b);
        assertEquals(expectedValue,value,"Erro");
    }
    /* este teste parametrizado significa que o teste acima irá rodar três vezes, cada uma com os parametros passados
    * necessário usar o mesmo nome nos dois metodos para o reconhecimento de que estão juntos */
//    private static Stream<Arguments> testSubtraction(){
//        return Stream.of(
//                Arguments.of(8,6,2),
//                Arguments.of(21,5,16),
//                Arguments.of(33,5,28)
//        );
//    }
}
