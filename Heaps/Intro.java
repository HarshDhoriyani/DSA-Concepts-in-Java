import java.util.Comparator;
import java.util.PriorityQueue;

public class Intro {
    public static void main(String[] args) {
        // 1, 2, 3, 4, 5
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        pq.add(3); // add() -> O(log n)
        pq.add(4);
        pq.add(1);
        pq.add(7);

        while (!pq.isEmpty()) {
            System.out.print(pq.peek() + " "); // peek() -> O(1)
            pq.remove(); // remove() -> O(log n)
        }
    }
}
