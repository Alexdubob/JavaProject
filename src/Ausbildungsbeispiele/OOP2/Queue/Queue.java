package Ausbildungsbeispiele.OOP2.Queue;
public class Queue {
    Node head;
    Node tail;
    static class Node {
        int value;
        Node next;
        Node(int d) {
            value = d;
            next = null;
        }
    }

    public static void main(String[] args) {
        Queue queue = new Queue ();
        Queue queue2 = new Queue();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.enqueue(60);
        queue.enqueue(70);
        queue.enqueue(80);
        queue.enqueue(90);
        queue.dequeue();
        queue.printList();
        System.out.println("\nsize = " + queue.size());
        //stack.pop();
        queue2 = queue.dequeue(6);
        queue2.printList();
        System.out.println();
        queue.printList();
        System.out.println("\nsize = " + queue.size());
    }

    //inserts a new element at the end of the Queue
    public void enqueue(int newElement) {
        Node newNode = new Node(newElement);
        if (head == null) {
            head = tail = newNode;
            tail.next = null;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = null;
        }
    }

    //returns the number of elements in the Queue
    public int size() {
        Node node = head;
        int size = 0;
        while (node != null) {
            size++;
            node = node.next;
        }
        return size;
    }

    //returns the first element of the Queue and removes it
    public void dequeue(){
        if (head == null){
            System.out.println("Queue is empty");
            return;
        }
        head = head.next;
    }

    //returns the first n elements of the Queue and removes them
    public Queue dequeue (int n) {
        if (head == null){
            System.out.println("Queue is empty");
        }
        Queue s = new Queue();
        for (int i = 0; i < n; i++) {
            s.enqueue(head.value);
            head = head.next;
        }

        System.out.println("\ndeleting: ");
        return s;
    }
    //prints the whole Queue
    public void printList() {
        Node n = head;
        while (n != null) {
            System.out.print(n.value + " ");
            n = n.next;
        }
    }
}

