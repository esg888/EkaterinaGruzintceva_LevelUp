package calculatortests;
import org.testng.annotations.Test;
import ru.levelup.qa.at.calculator.Calculator;
import static org.testng.Assert.assertEquals;

public class CalculatorCosTest {

    @Test
    public void calculatorCosDoubleTest() {
        Calculator calculator = new Calculator();
        double actualCosDob = calculator.cos(0.5);
        assertEquals(actualCosDob, 0.87758, 0.0001);
    }
}
