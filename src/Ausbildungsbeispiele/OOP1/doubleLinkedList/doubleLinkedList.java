package Ausbildungsbeispiele.OOP1.doubleLinkedList;

public class doubleLinkedList {
    class Node {
        int value;
        Node previous;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    Node head = null;
    Node tail = null;

    public void addNode(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = tail = newNode;
            head.previous = null;
            tail.next = null;
        } else {
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
            tail.next = null;
        }
    }

    public void printNodes() {
        Node current = head;
        if (head == null) {
            System.out.println("Double linked List is empty");
            return;
        }
        System.out.println("Nodes of double linked List: ");
        while (current != null) {
            System.out.println(current.value + " ");
            current = current.next;
        }
    }

    public static void main(String[] args) {
        doubleLinkedList dlList = new doubleLinkedList();
        dlList.addNode(10);
        dlList.addNode(20);
        dlList.addNode(30);
        dlList.addNode(40);
        dlList.addNode(50);

        dlList.printNodes();


    }
}
