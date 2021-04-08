package calculatortests;
import org.testng.annotations.Test;
import ru.levelup.qa.at.calculator.Calculator;
import static org.testng.Assert.assertEquals;

public class CalculatorCtgTest {
            @Test
        public void calculatorCtgDoubleTest() {
        Calculator calculator = new Calculator();
        double actualCtgDob = calculator.ctg(5);
        assertEquals(actualCtgDob, -0.295812, 0.0001);
    }
}
