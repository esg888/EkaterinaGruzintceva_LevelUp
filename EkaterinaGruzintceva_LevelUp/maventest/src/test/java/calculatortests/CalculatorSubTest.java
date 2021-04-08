package calculatortests;
import org.testng.annotations.Test;
import ru.levelup.qa.at.calculator.Calculator;
import static org.testng.Assert.assertEquals;

public class CalculatorSubTest {
    @Test
public void calculatorSubDoubleTest() {
    Calculator calculator = new Calculator();
    double actualSubDob = calculator.sub(5, 3);
    assertEquals(actualSubDob, 3.0, 0.0001);
}
    @Test
    public void calculatorSudLongTest() {
        Calculator calculator = new Calculator();
        long actualSubLong = calculator.sub(5L, 3L);
        assertEquals(actualSubLong, 3L, 0.0001);
    }
}
