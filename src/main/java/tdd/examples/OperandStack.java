package tdd.examples;

import java.math.BigDecimal;
import java.util.Stack;

/**
 * @author ilariacorda on 05/07/2017.
 * @project Java-Code-Experiments
 */
public class OperandStack {

    private final Stack<BigDecimal> values = new Stack<BigDecimal>();

    public BigDecimal peek() {
        if (this.values.size() == 0) {
            return BigDecimal.ZERO;

        }
        return this.values.peek();
    }

    public void push(BigDecimal value) {
        this.values.push(value);

    }

    public void replaceTop(BigDecimal replacementValue) {
        this.values.pop();
        this.values.push(replacementValue);

    }
}
