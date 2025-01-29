import StrategyPattern.Ali;
import StrategyPattern.Parent;
import StrategyPattern.Paycom;
import StrategyPattern.Paystack;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StrategyTest {

    @Test
    void testThatHelloIsWorking() {
        Ali elements = new Paystack();
        elements.sayHi();
    }

    @Test
    void testThatSayHiIsCorrect() {
        Ali checks = new Paycom();
        checks.sayHello();
    }

    @Test
    void testThatPayIsWorking() {
    }
}