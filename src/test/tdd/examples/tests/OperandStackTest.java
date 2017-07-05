package tdd.examples.tests;

import org.junit.Before;
import org.junit.Test;
import tdd.examples.OperandStack;


import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

/**
 * @author ilariacorda on 05/07/2017.
 * @project Java-Code-Experiments
 */

public class OperandStackTest {
    OperandStack stack;

    @Before
    public void createStack() {
        this.stack = new OperandStack();

    }

    @Test
    public void testNewOperandStackPeekReturnsZero() {
        assertEquals(BigDecimal.ZERO, this.stack.peek());
    }

    @Test
    public void testPushingValueOntoStack() {
        BigDecimal value = new BigDecimal(12);
        this.stack.push(value);
        assertEquals(value, this.stack.peek());

    }

    @Test
    public void testReplacingTopStack() {
        this.stack.push(new BigDecimal(22));
        BigDecimal replacementValue = new BigDecimal(66);
        this.stack.replaceTop(replacementValue);
        assertEquals(replacementValue, this.stack.peek());

    }
}
