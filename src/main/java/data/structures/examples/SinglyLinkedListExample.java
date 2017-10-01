package data.structures.examples;

/**
 * @author ilariacorda on 06/07/2017.
 * @project Java-Code-Experiments
 * Java implementation of a singly linked list
 */
public class SinglyLinkedListExample {

    Node head;
    Node tail;

    public static void main (String args[]){

    }

    public void add(int data){
        //Add a Node to the end of the list

        Node node = new Node(data);

        if (tail == null){
            head = node;
            tail = node;
        }
        else {
            tail.nextNode = node;
            tail = node;
        }

    }

    public void prePrend(Node node){

    }

    //Getters and Setters

    public Node getHead() {
        return this.head;
    }

    public Node getTail() {
        return this.tail;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }

    public int size() {
        int size = 0;
        for(Node n = head; n.nextNode != null; n = n.nextNode)
            size++;
        return size;
    }

//    public Node delete(int data){
//        //Let's find the data in the node
//        Node node =  find(data);
//
//        if (node != null){
//
//            if (tail == node){
//
//            }
//        }
//    }

    public Node find(int data) {

        if (head == null) {
            return null;
        }

        //this is to check the first element for a match
        if (head.data == data){
            return head;
        }

        //assigne node to act as the iterator
        Node node = head;

            while (node.nextNode != null) {

                node = node.nextNode;

                if (node.data == data) ;
                {
                    return node;
                }

            }

            return null;
    }
}
