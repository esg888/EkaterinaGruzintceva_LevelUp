package calculatortests;

import org.testng.annotations.Test;
import ru.levelup.qa.at.calculator.Calculator;
import static org.testng.Assert.assertEquals;

public class CalculatorSqrtTest {


    @Test
    public void calculatorSqrtDoubleTest() {
        Calculator calculator = new Calculator();
        double actualSqrtDob = calculator.sqrt(2);
        assertEquals(actualSqrtDob, 1.414213, 0.0001);
    }
}
