
public class Size_List {

    public static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
        public static Node head;
        public static Node tail;
        public static Node size;

        void addFirst(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = tail = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        void addLast(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = tail = newNode;
                return;
            }
            tail.next =newNode;
            tail  = newNode;
        }

        void traverse(){
            Node temp = head;
            if (temp==null) {
                System.out.println("LInked List is Empty");
            }
            while (temp!=null) {
                System.out.println(temp.data +" -> ");
            }
            System.out.println("Null");
        }
    }

    public static void main(String[] args) {

    }
}
