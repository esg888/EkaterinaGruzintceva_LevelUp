package calculatortests;

import org.testng.annotations.Test;
import ru.levelup.qa.at.calculator.Calculator;

import static org.testng.Assert.assertEquals;

public class CalculatorTgTest {

    @Test
    public void calculatorTgDoubleTest() {
        Calculator calculator = new Calculator();
        double actualTgDob = calculator.tg(8);
        assertEquals(actualTgDob, -6.79971, 0.0001);
    }
}
