import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class MethodsOrderedByOrderIndex {
    @Order(1)
    @Test
    void testA(){
        System.out.println("Running test a");
    }
    @Order(4)
    @Test
    void testD() {
        System.out.println("Running test d");
    }
    @Order(2)
    @Test
    void testB(){
        System.out.println("Running test b");
    }
    @Order(3)
    @Test
    void testC(){
        System.out.println("Running test c");
    }
}
