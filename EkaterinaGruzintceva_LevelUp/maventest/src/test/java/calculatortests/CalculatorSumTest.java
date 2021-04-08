package calculatortests;
import org.testng.annotations.Test;
import ru.levelup.qa.at.calculator.Calculator;
import static org.testng.Assert.assertEquals;

public class CalculatorSumTest {
    @Test
    public void calculatorSumDoubleTest() {
        Calculator calculator = new Calculator();
        double actualSumDob = calculator.sum(5, 3);
        assertEquals(actualSumDob, 8.0, 0.0001);
    }
    @Test
    public void calculatorSumLongTest() {
        Calculator calculator = new Calculator();
        long actualSumLong = calculator.sum(5L, 3L);
        assertEquals(actualSumLong, 8L, 0.0001);
    }
}
