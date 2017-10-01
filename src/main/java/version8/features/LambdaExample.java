package version8.features;

/**
 * @author ilariacorda on 12/08/2017.
 * @project Java-Code-Experiments
 */

        import org.junit.Test;


import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class LambdaExample
{
    Long id = 0L;

    @Test
    public void test ()
    {
        List<Transaction> transactions = new ArrayList<>();

        for (int i=0; i<200; i++)
            transactions.add(buildTransaction());

        System.out.println(transactions);

        Collections.sort(transactions, (t1, t2) -> t1.getDate().compareTo(t2.getDate()));

        System.out.println(transactions);
    }

    private Transaction buildTransaction()
    {
        id++;

        Transaction transaction = new Transaction();
        transaction.setId(id);
        transaction.setAmount(generateRandomAmount());

        long millis = ThreadLocalRandom.current().nextLong(1400000000000L, 1500000000000L);
        transaction.setDate(new Date(millis));

        return transaction;
    }

    private double generateRandomAmount()
    {
        double amount = ThreadLocalRandom.current().nextDouble() * 1000;
        amount = amount * 100.0;
        amount = Math.round(amount);
        amount = amount / 100.0;
        return amount;
    }

}

