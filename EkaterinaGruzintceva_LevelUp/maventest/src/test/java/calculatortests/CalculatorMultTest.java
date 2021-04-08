package calculatortests;
import org.testng.annotations.Test;
import ru.levelup.qa.at.calculator.Calculator;
import static org.testng.Assert.assertEquals;

public class CalculatorMultTest {
    @Test
    public void calculatorMultDoubleTest() {
        Calculator calculator = new Calculator();
        double actualMultDob = calculator.mult(5, 3);
        assertEquals(actualMultDob, 15.0, 0.0001);
    }
    @Test
    public void calculatorSudLongTest() {
        Calculator calculator = new Calculator();
        long actualMultLong = calculator.mult(5L, 3L);
        assertEquals(actualMultLong, 15L, 0.0001);
    }
}
