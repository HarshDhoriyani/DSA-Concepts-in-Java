import java.util.*;

public class InterleaveQueues {

    public static void interleave(Queue<Integer> q) {
        Queue<Integer> q2 = new LinkedList<>(); // firsthalf

        int size = q.size();
        for (int i = 0 ; i < size/2 ; i++) {
            q2.add(q.remove());
        }

        while (!q2.isEmpty()) { 
            q.add(q2.remove());
            q.add(q.remove());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        for (int i = 1 ; i <= 10; i++) {
            q.add(i);
        }

        interleave(q);
        while(!q.isEmpty()) {
            System.out.print(q.remove() + " ");
        }
        System.out.println();
    }
}