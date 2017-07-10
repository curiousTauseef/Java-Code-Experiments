package data.structures.examples;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author ilariacorda on 10/07/2017.
 * @project Java-Code-Experiments
 * Reverse an Array String using Collection.reverse
 */
public class StringArrayReversed {
    public static void main(String args[]) {
        String[] array = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        List<String> list = Arrays.asList(array);
        Collections.reverse(list);
        array = (String[]) list.toArray();

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + "");
        }
    }
}
