public class Find_RemoveNthFromEnd {
    public static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    public void RemoveNthFromEnd(int n) {
        // calculating size
        int sz = 0;
        Node temp = head;
        while (temp != null)  {
            temp = temp.next;
            sz++;
        }

        int i = 1;
        int iToFind = sz-n;
        Node prev = head;
        while (i < iToFind) {
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;
    }

    public void display() {
        Node temp = head;
        while (temp!=null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        Find_RemoveNthFromEnd ll = new Find_RemoveNthFromEnd();

        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);

        System.out.println("Linked List : ");
        ll.display();
        
        int n = 3;
        System.out.println("Removing 3rd element from last : ");
        ll.RemoveNthFromEnd(n);
        ll.display();
    }
}
