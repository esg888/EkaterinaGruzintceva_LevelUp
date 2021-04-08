package calculatortests;

import org.testng.annotations.Test;
import ru.levelup.qa.at.calculator.Calculator;

import static org.testng.Assert.assertEquals;

public class CalculatorSinTest {


    @Test
    public void calculatorSinDoubleTest() {
        Calculator calculator = new Calculator();
        double actualSinDob = calculator.sin(0.5);
        assertEquals(actualSinDob, 0.479425, 0.0001);
    }

}
