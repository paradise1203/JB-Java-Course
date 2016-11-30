package org.jblab;

import net.bytebuddy.asm.Advice;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created by aleksandrpliskin on 30.11.16.
 */
public class CalculatorTest {

    private static Calculator calculator;
    private static BrainCalculator brainCalculator;

    private static final double N_1 = 2.0d;
    private static final double N_2 = 5.6d;
    private static final double DELTA = 10e-2;

    @BeforeClass
    public static void setUp() {
        brainCalculator = mock(BrainCalculator.class);
        when(brainCalculator.cos(50)).thenThrow(ArithmeticException.class);
        when(brainCalculator.cos(30)).thenReturn(Math.cos(30));
        calculator = new Calculator(brainCalculator);
    }

    @Test
    public void sumShouldReturnCorrectSum() {
        Assert.assertEquals(N_1 + N_2, calculator.sum(N_1, N_2), DELTA);
    }


    @Test
    public void subShouldReturnCorrectSub() {
        Assert.assertEquals(N_1 - N_2, calculator.sub(N_1, N_2), DELTA);
    }

    @Test
    public void cosShouldReturnCorrectValue() {
        Assert.assertEquals(Math.cos(30), calculator.cos(30), DELTA);
    }

    @Test(expected = ArithmeticException.class)
    public void cosShouldThrowAnExceptionWhenArgumentIsOfDouble() {
        calculator.cos(50);
        verify(brainCalculator.cos(50), times(5));
    }

    @Test(timeout = 5000)
    public void methodShouldWorkNotMoreThan5Seconds() {
        calculator.method();
    }

}
