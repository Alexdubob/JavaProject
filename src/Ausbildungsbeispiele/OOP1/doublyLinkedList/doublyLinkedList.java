package Ausbildungsbeispiele.OOP1.doublyLinkedList;

public class doublyLinkedList {
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

    public static void main(String[] args) {
        doublyLinkedList dlList = new doublyLinkedList();
        dlList.addNode(10);
        dlList.addNode(20);
        dlList.addNode(30);
        dlList.addNode(40);
        dlList.addNode(50);

        dlList.printNodesHead();
        dlList.printNodesTail();
        System.out.println("Element at index 3 " + dlList.getNode(3));
        System.out.println("The size of the current list is: " + dlList.nodeSize());
        dlList.removeAt(0);
        dlList.removeAt(2);
        dlList.removeAt(dlList.nodeSize() - 1);
        System.out.println("After deletion");
        dlList.printNodesHead();
        dlList.printNodesTail();
    }



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


    public void addAfter(int index, int value) {
        doublyLinkedList.Node n = head;
        doublyLinkedList.Node m = tail;
        doublyLinkedList.Node newNode = new doublyLinkedList.Node(value);
        for (int i = 0; i < index - 1; i++) {
            n = n.next;
            m = m.previous;
        }
        newNode.next = n.next;
        n.next = newNode;
        newNode.previous = m.previous;
        m.previous = newNode;
    }


    public void printNodesHead() {
        Node current = head;
        if (head == null) {
            System.out.println("Double linked List is empty");
            return;
        }
        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.println(" ");
    }


    public void printNodesTail() {
        Node current = tail;
        if (tail == null) {
            System.out.println("Double linked List is empty");
            return;
        }
        while (current != null) {
            System.out.print(current.value + " ");
            current = current.previous;
        }
        System.out.println(" ");
    }


    public int nodeSize() {
        Node node = head;
        int size = 0;
        while (node != null) {
            size++;
            node = node.next;
        }
        return size;
    }


    public int getNode(int value) {
        int index = 3;
        if (index < nodeSize() / 2) {
            Node current = head;
            int count = 0;
            while (current != null) {
                if (count == value)
                    return current.value;
                count++;
                current = current.next;
            }
        } else {
            Node current = tail;
            int count = 0;
            while (current != null) {
                if (count == value)
                    return current.value;
                count++;
                current = current.previous;
            }
        }
        assert (false);
        return 0;
    }


    public Node deleteNode(Node del) {
        if (head == null || tail == null)
            return null;

        if (head == del)
            head = del.next;

        if (tail == del)
            tail = del.previous;

        if (del.next != null)
            del.next.previous = del.previous;

        if (del.previous != null)
            del.previous.next = del.next;

        return head;
    }


    public void removeAt(int position) {
        if (head == null) {
            return;
        } else {
            Node current = head;

            for (int i = 0; current != null && i < position; i++) {
                current = current.next;
            }
            if (current == null)
                return;
            deleteNode(current);
        }
    }
}






