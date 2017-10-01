package data.structures.examples;

/**
 * @author ilariacorda on 06/07/2017.
 * @project Java-Code-Experiments
 * Java implementation of the Node object for Linked Lists.
 */


public class Node {

    Node nextNode;
    int data;


    public Node(int data){
        this.data = data;
    }


    public Node(Node nextNode, int data){
        this.nextNode = nextNode;
        this.data = data;
    }

    //Getters and Setters

//    public int getData() {
//        return this.data;
//    }
//
//    public Node getNextNode() {
//        return this.nextNode;
//    }
//
//    public void setData(int data) {
//        this.data = data;
//    }
//
//    public void setNextNode(Node nextNode) {
//        this.nextNode = nextNode;
//    }

    @Override
    public String toString(){
        return "" + data;
    }

}
