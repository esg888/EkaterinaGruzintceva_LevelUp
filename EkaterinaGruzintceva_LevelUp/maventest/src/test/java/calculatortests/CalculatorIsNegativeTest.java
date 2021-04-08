package calculatortests;

import org.testng.annotations.Test;
import ru.levelup.qa.at.calculator.Calculator;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class CalculatorIsNegativeTest {
    @Test
    public void calculatorIsNegativeLongTest() {
        Calculator calculator = new Calculator();
        boolean actualisNegativeLong = calculator.isNegative(-5L);
        assertTrue(actualisNegativeLong);
    }

}
