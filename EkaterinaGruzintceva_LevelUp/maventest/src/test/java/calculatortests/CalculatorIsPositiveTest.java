package calculatortests;
import org.testng.annotations.Test;
import ru.levelup.qa.at.calculator.Calculator;

import static org.testng.Assert.*;

public class CalculatorIsPositiveTest { //isPositive

    @Test
    public void calculatorIsPositiveLongTest() {
        Calculator calculator = new Calculator();
        boolean actualisPositiveLong = calculator.isPositive(5L);
        assertTrue(actualisPositiveLong);
    }
    @Test
    public void calculatorIsPositiveLong0Test() {
        Calculator calculator = new Calculator();
        boolean actualisPositiveLong = calculator.isPositive(0L);
        assertFalse(actualisPositiveLong);
    }
}
