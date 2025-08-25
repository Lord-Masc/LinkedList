
public class Iterative_Search1 {

    public static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

    }
    static Node head;
    static Node tail;
    static int Size;

    void addFirst(int data) {
        Node newNode = new Node(data);
        Size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    void addLast(int data) {
        Node newNode = new Node(data);
        Size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    void traverse(){
        Node temp = head;
        while(temp !=null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    void search(int key){
        Node temp = head;
        int i= 0;
        while(temp!=null){
            if(temp.data ==key){
                System.out.println("Number is present at index :- "+i);
            }
            temp = temp.next;
            i++;
        }
    }

    public static void main(String[] args) {
          Iterative_Search1 list = new Iterative_Search1();
          list.addFirst(10);
          list.addFirst(20);
          list.addFirst(30);
          list.addLast(5);
          list.addLast(1);

          list.traverse();
            list.search(20);
          
          System.out.println(Size);
          System.out.println("this is my code");
    }
}
