import org.Theis.RestController;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RestController_Test {
    @Test
    public void test_generateRandomNumber(){
        RestController controller = new RestController();
        String result = controller.generateRandomNumber();
        int resultNumber = Integer.parseInt(result);
        Assertions.assertTrue(resultNumber <= 600 && resultNumber >= 500);

    }
}
