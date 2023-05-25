package Ausbildungsbeispiele.OOP1.linkedList;

public class linkedList {
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
        linkedList sList = new linkedList();

        sList.addNode(8);
        sList.addNode(22);
        sList.addNode(23);
        sList.addNode(54);
        sList.addNode(16);
        sList.printList();
        System.out.println("\nElement at index 2 is " + sList.getNode(2));
        sList.remove(2);
        System.out.print("\nList after Deletion of position 2\n");
        sList.printList();
        System.out.println("");
        sList.addAfter(2,50);
        sList.printList();
    }

    public void remove(int position) {
        if (head == null)
            return;
        Node temp = head;

        if (position == 0) {
            head = temp.next;
            return;
        }
        for (int i = 0; temp != null && i < position - 1; i++)
            temp = temp.next;

        if (temp == null || temp.next == null)
            return;

        Node next = temp.next.next;
        temp.next = next;
    }

    public void addNode(int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
    }

    public void addAfter(int index, int value) {
        Node n = head;
        Node newNode = new Node(value);
        for (int i = 0; i < index - 1; i++) {
            n = n.next;
        }
        newNode.next = n.next;
        n.next = newNode;
    }
    public int getNode(int value) {
        Node current = head;
        int count = 0;
        while (current != null) {
            if (count == value)
                return current.value;
            count++;
            current = current.next;
        }
        assert (false);
        return 0;
    }

    public void printList() {
        Node n = head;
        while (n != null) {
            System.out.print(n.value + " ");
            n = n.next;
        }
    }

}
