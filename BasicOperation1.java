
public class BasicOperation1 {


    //Step 1 :-  Create a node of linked list
    public static class Node{
        int data;
        Node next ;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node Head;
    public static Node Tail;

    public void addFirst(int data){

        // Insert data in node
        Node newNode = new Node(data);
        if(Head == null){
            Head = Tail = newNode;
            return;
        }
        newNode.next = Head;
        Head = newNode;
        printList();

    }

    public void addLast(int data){
        Node newNode = new Node(data);
        if (Head == null) {
            Head = Tail = newNode;
            return;
        }
        Tail.next = newNode;
        newNode = Tail;
        printList();
    }
    static void addIndex(int data, int index){
        Node temp = Head;
        Node newNode = new Node(data);
        int i = 0;
        while (i<index-1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        printList();
    }
    static void printList(){
        Node temp = Head;
        if (Head==null) {
            System.out.println("linked list is empty");
        }
        while (temp!=null) {
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println("Null");
    }
    void countElement(){
        int count  = 1;
        Node temp = Head;
        while(temp.next!=null){
            count++;
            temp = temp.next;
        }
        System.out.println("Number of element in linked list is "+count);
    }
    
    public static void main(String[] args) {
        BasicOperation1 b1 = new BasicOperation1();
        b1.addFirst(2);
        b1.addFirst(4);
        b1.addFirst(6);
        b1.addFirst(8);
        b1.addFirst(10);
        b1.addLast(12);
        b1.addLast(14);
        b1.addIndex(13, 3);
        b1.countElement();
    }
}
