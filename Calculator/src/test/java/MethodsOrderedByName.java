import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.MethodName.class)

public class MethodsOrderedByName {
    @Test
    void testA(){
        System.out.println("Running test a");
    }
    @Test
    void testD(){
        System.out.println("Running test d");
    }
    @Test
    void testB(){
        System.out.println("Running test b");
    }
    @Test
    void testC(){
        System.out.println("Running test c");
    }

}
