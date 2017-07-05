package tdd.examples.tests;

import org.junit.Before;
import org.junit.Test;
import tdd.examples.Calculator;


import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

/**
 * @author ilariacorda on 05/07/2017.
 * @project Java-Code-Experiments
 */
public class CalculatorWithValuesTest {
    private Calculator calculator;
    private BigDecimal value1;
    private BigDecimal value2;
    private BigDecimal value3;


    @Before
    public void createCalculatorWithThreeValues() {
        this.calculator = new Calculator();
        this.value1 = new BigDecimal(12);
        this.value2 = new BigDecimal(22);
        this.value3 = new BigDecimal(52);

        this.calculator.setAccumulator(this.value1);
        this.calculator.enter();
        this.calculator.setAccumulator(this.value2);
        this.calculator.enter();
        this.calculator.setAccumulator(this.value3);

    }

    @Test
    public void testAccumulatorAfterPushingThreeValues() {
        assertEquals(this.value3, this.calculator.getAccumulator());

    }

    @Test
    public void testAccumulatorSingleDrop() {
        this.calculator.drop();
        assertEquals(this.value2, this.calculator.getAccumulator());

    }

    @Test
    public void testAccumulatorAfterDroppingTwice() {
        this.calculator.drop();
        this.calculator.drop();
        assertEquals(this.value1, this.calculator.getAccumulator());

    }
}
