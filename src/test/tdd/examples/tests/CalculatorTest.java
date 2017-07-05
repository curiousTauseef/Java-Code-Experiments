package tdd.examples.tests;

import org.junit.Before;
import org.junit.Test;
import tdd.examples.Calculator;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

/**
 * Created by ilariacorda on 03/07/2017.
 * TDD example for the Calculator Class
 */

public class CalculatorTest {

    private Calculator calculator;
    //To avoid duplication, but we cannot include it in the Before section
    // This needs instantiating otherwise it will return null later on in the test;
    private BigDecimal value = BigDecimal.ZERO;

    @Before
    public void createCalculator() {
        this.calculator = new Calculator();
    }

    @Test
    public void testNewCalculatorHasAnAccumulatorOfZero() {
        assertEquals(BigDecimal.ZERO, this.calculator.getAccumulator());
    }

    @Test
    public void testSettingAccumulatorValue() {
        this.value = new BigDecimal(23);
        this.calculator.setAccumulator(this.value);
        assertEquals(this.value, this.calculator.getAccumulator());
    }

    @Test
    public void testEnteringAndDroppingCalculatorValues() {
        this.value = new BigDecimal(12);
        BigDecimal value1 = new BigDecimal(22);
        BigDecimal value2 = new BigDecimal(52);
        this.calculator.setAccumulator(this.value);
        this.calculator.enter();
        this.calculator.setAccumulator(value1);
        this.calculator.enter();
        this.calculator.setAccumulator(value2);
        this.calculator.enter();
        assertEquals(value2, this.calculator.getAccumulator());
        this.calculator.drop();
        assertEquals(value1, this.calculator.getAccumulator());
        this.calculator.drop();
        assertEquals(this.value, this.calculator.getAccumulator());

    }
}
