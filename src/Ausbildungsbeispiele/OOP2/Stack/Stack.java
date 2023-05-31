package Ausbildungsbeispiele.OOP2.Stack;
public class Stack {
    Node head;

    static class Node {
        int value;
        Node next;

        Node(int d) {
            value = d;
            next = null;
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        Stack stack2 = new Stack ();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);
        stack.push(70);
        stack.push(80);
        stack.push(90);
        stack.printList();
        System.out.println();
        stack2 = stack.pop(2);
        stack2.printList();
        System.out.println();
        stack.printList();
        System.out.println("\npeek = " + stack.peek());
        System.out.println("size = " + stack.size());
    }

    //inserts a new element at the top of the stack
    public void push(int newElement) {
        Node newNode = new Node(newElement);
        newNode.next = head;
        head = newNode;
    }

    //returns the number of elements in the stack
    public int size() {
        Node node = head;
        int size = 0;
        while (node != null) {
            size++;
            node = node.next;
        }
        return size;
    }

    //returns the last element of the stack and removes it from the stack
    public void pop(){
        if (head == null)
            return;
        head = head.next;
    }
    //returns the last element of the stack without modifying the stack
   public int peek(){
       if (head == null) {
           System.out.println("Double linked List is empty");
       }
       return head.value;
    }

    //returns the last n elements of the stack and removes them from the stack
    public Stack pop (int n) {
        Stack s = new Stack();
        for (int i = 0; i < n; i++) {
            s.push(head.value);
            head = head.next;
        }
        System.out.println("Deleting: ");
        return s;
    }
    //prints the whole stack
    public void printList() {
        Node n = head;
        while (n != null) {
            System.out.print(n.value + " ");
            n = n.next;
        }
    }
}

