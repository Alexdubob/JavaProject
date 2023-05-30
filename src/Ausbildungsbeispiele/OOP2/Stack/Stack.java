package Ausbildungsbeispiele.OOP2.Stack;
public class Stack {
    Node head;
    class Node {
        int value;
        Node next;
        Node(int d) {
            value = d;
            next = null;
        }
    }
    public static void main(String[] args) {
        Stack stack = new Stack();

    }
    void push (int newElement){


    }
    public int size(){
        Node node = head;
        int size = 0;
        while (node != null) {
            size++;
            node = node.next;
        }
        return size;
    }

   /* public int pop(){

    }
    public int peek(){

    }
    public int[] pop(int n){

    }*/
}
