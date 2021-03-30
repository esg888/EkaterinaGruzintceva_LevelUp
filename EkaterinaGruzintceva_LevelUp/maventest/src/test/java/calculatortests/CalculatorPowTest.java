package calculatortests;

import org.testng.annotations.Test;
import ru.levelup.qa.at.calculator.Calculator;

import static org.testng.Assert.assertEquals;

public class CalculatorPowTest {


    @Test
    public void calculatorPowDoubleTest() {
        Calculator calculator = new Calculator();
        double actualPowDob = calculator.pow(2, 3);
        assertEquals(actualPowDob, 8.0, 0.0001);
    }
}
