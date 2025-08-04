import java.util.LinkedList;

// Linked List in Java Collections FrameWork

public class LLinJCF {

    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();

        //add
        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(0);

        //print
        System.out.println(ll);

        //remove
        ll.removeLast();
        ll.removeFirst();

        //print
        System.out.println(ll);
    }
}