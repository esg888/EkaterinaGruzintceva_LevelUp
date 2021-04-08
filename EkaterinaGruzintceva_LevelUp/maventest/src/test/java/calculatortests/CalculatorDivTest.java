package calculatortests;

import org.testng.annotations.Test;
import ru.levelup.qa.at.calculator.Calculator;

import static org.testng.Assert.assertEquals;

public class CalculatorDivTest {
    @Test
    public void calculatorDobDivTest() {
        Calculator calculator = new Calculator();
        double actualDobDiv = calculator.div(6, 3);
        assertEquals(actualDobDiv, 2.0, 0.0001);
    }
    @Test
            (expectedExceptions = NumberFormatException.class)
    public void calculator0Test() {
        Calculator calculator = new Calculator();
        calculator.div(6L, 0L);
    }

}
