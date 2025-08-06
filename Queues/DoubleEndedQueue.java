import java.util.*;

public class DoubleEndedQueue {

    public static void main(String[] args) {
        Deque<Integer> d = new LinkedList<>();

        d.addFirst(1);
        d.addFirst(2);
        d.addLast(3);
        d.addLast(4);
        System.out.println(d);

        d.removeFirst();
        d.removeLast();
        System.out.println(d);
        
        System.out.println("First element: " + d.getFirst());
        System.out.println("LAst element : " + d.getLast());
    }
}