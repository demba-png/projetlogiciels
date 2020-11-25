package projet;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class calculatorTest {
    calculator calculator;

    @Before
    public void setUp() throws Exception {
        calculator = new calculator();
    }

    @Test
    public void testSum(){
        int res1 = calculator.sum(2,6);
        Assert.assertEquals(8,res1);


    }

    @Test
    public void testMinus() {
        Assert.assertEquals(4, calculator.minus(8,4));

    }

    @Test
    public void testDivide(){
        Assert.assertEquals(2, calculator.divide(10,5));

    }

    @Test(expected = ArithmeticException.class)
    public void testDivideWillThrowExceptionWhenDivideOnZero() {
        calculator.divide(6, 0);

    }

    @Test
    public void testMultiply(){
        Assert.assertEquals(14, calculator.multiply(7,2));

    }

    @Test

    public void testMinimal(){
        int min1 = calculator.min(20,10);
        if (min1 != 10) Assert.fail();

        int min4 = calculator.min(98,18);
        if (min4 != 18) Assert.fail();

    }

    @Test
    public void testMax() {
        int max1 = calculator.max(2, -2);
        Assert.assertEquals(2, max1);

        int max2 = calculator.max(9, 8);
        Assert.assertEquals(9, max2);


    }
}
