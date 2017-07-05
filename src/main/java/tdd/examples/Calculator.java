package tdd.examples;

import java.math.BigDecimal;
import java.util.Stack;

/**
 * Created by ilariacorda on 03/07/2017.
 * Calculator Class used in our TDD example
 */
public class Calculator {

    //We need to initialiase our accumulator otherwise it will return null
    private final Stack<BigDecimal> values = new Stack();

    public BigDecimal getAccumulator() {
        //return the most recent inserted element in the stack
        if (this.values.size() == 0) {
            return BigDecimal.ZERO;
        }
        return this.values.peek();

    }

    public void setAccumulator(BigDecimal value) {
        //it returns the element on the top of the stack without removing it
        if (this.values.size() > 0)
            this.values.pop();
        // it pushes the element onto the stack
        this.values.push(value);
    }

    public void enter() {
        this.values.push(this.getAccumulator());
    }

    public void drop() {
        this.values.pop();
    }
}
