package data.structures.examples.tests;


import data.structures.examples.SinglyLinkedListExample;
import org.junit.Test;

/**
 * @author ilariacorda on 07/07/2017.
 * @project Java-Code-Experiments
 */

public class SinglyLinkedListExampleTest {
    SinglyLinkedListExample linkedListExample;

    @Test
    public void test(){
        linkedListExample = new SinglyLinkedListExample();
        linkedListExample.add(15);
        linkedListExample.add(16);
        linkedListExample.add(10);

        //Next time we need to loop through the linked list


        System.out.println("Does 10 exists in the list " + linkedListExample.find(10));
        System.out.println("Does 15 exists in the list " + linkedListExample.find(15));
        System.out.println("Does 16 exists in the list " + linkedListExample.find(16));
        System.out.println("Does 20 exists in the list " + linkedListExample.find(20));
        System.out.println("Does 1 exists in the list " + linkedListExample.find(1));

//        linkedListExample.delete(16);
//        System.out.println("Does 16 exists in the list " + linkedListExample.find(16));


        System.out.println("Test has ended");


    }
}
