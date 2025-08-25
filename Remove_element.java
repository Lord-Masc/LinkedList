
public class Remove_element {

    static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    static Node head;
    static Node tail;

    void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    void removeFirst(){
        int val = head.data;
        head = head.next;
        System.out.println("Removed first element: " + val);
    }

    void removeLast(){
        Node temp = head;
        while (temp.next!= tail) {
            temp  = temp.next;
        }//th
        int val = tail.data;
        temp.next = null;
        tail = temp;
        System.out.println("Removed last element: " + val);
    }

    void traverse() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    public static void main(String[] args) {
        Remove_element list = new Remove_element();
        list.addFirst(90);
        list.addFirst(80);
        list.addFirst(70);
        list.addFirst(60);
        list.addFirst(50);
        list.addFirst(40);

        list.traverse();
        list.removeFirst();
        list.removeLast();
        list.traverse();
    }
}
