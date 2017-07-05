import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author ilariacorda on 06/07/2017.
 * @project Java-Code-Experiments
 * Very simple example of a Linked List
 */
public class LinkedListExample {

    public static void main(String args[]) {
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("Rome");
        linkedList.add("Milan");
        linkedList.add("Turin");

        Iterator<String> iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
