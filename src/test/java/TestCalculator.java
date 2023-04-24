import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCalculator {
    Calculator calculator = new Calculator();
    @Test
    public void testAdd() {
        assertEquals(calculator.add(1.0 , 0.0), 1);
    }

    @Test
    public void testSub() {
        assertEquals(calculator.sub(1.0 , 2.0), -1);
    }
    @Test
    public void testDiv() {
        assertEquals(calculator.div(1.0 , 2.0), 0.5);
    }
}
