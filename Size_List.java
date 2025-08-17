public class Size_List {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Linked List fields (belong to Size_List, not Node)
    public static Node head;
    public static Node tail;
    public static int size;

    // Add at beginning
    void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // Add at end
    void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    // Print list
    void traverse() {
        Node temp = head;
        if (temp == null) {
            System.out.println("Linked List is Empty");
            return;
        }
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Size_List list1 = new Size_List();
        list1.addFirst(10);
        list1.addFirst(20);
        list1.addLast(30);

        list1.traverse();
        System.out.println("Size of list: " + size);
    }
}
