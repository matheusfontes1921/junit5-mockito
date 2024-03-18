import org.example.Calculator;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DemoRepeatedTest {
    @DisplayName("Division by zero")
    @RepeatedTest(value=3, name="{displayName}. Repetition {currentRepetition}" /*how many times the test will be repeated*/)
    void testDivision_WhenDividendIsDividedByZero_ShouldThrowArithmeticException(RepetitionInfo repetitionInfo, TestInfo testInfo){
        //Arrange
        System.out.println(repetitionInfo.getCurrentRepetition());
        System.out.println(testInfo.getTestMethod().get().getName());
        Calculator calculator = new Calculator();
        int a = 4;
        int b = 0;
        String expectedExceptionMessage = "/ by zero"; //é a mensagem da exceção
        //Act & Assert
        ArithmeticException actualException = assertThrows(ArithmeticException.class,()->{
            //Act
            calculator.division(a,b);
        }, "Division by Zero should throw arithmetic exception");
        //Assert
        assertEquals(expectedExceptionMessage, actualException.getMessage(),"Unexpected exception method");
    }
}
