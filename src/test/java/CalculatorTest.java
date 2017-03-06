import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by binod.kc on 3/6/2017.
 */
public class CalculatorTest {
    @Test
    public void sum() throws Exception {
        int a = 2;
        int b = 3;

        Calculator calculator = new Calculator(a,b);
        assertEquals(5, calculator.sum());
    }

}