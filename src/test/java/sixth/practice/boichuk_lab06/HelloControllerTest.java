package sixth.practice.boichuk_lab06;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class HelloControllerTest {

    @Test
    void helloShouldReturnExpectedString() {
        BoichukLab06Application app = new BoichukLab06Application();
        String result = app.hello();
        assertEquals("CI/CD pipeline | Boichuk", result);
    }
}