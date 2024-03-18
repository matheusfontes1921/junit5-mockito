import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.Random.class)
public class MethodsOrderedRandomly {
    @Test
    void testA(){
        System.out.println("Running test a");
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
