
import java.util.PriorityQueue;

// Maximum of all Subarrays of size K

public class SlidingWindowMaximum {
    static class Pair implements Comparable<Pair> {
        int num;
        int index;

        public Pair(int num, int index) {
            this.num = num;
            this.index = index;
        }

        @Override
        public int compareTo(Pair p2) {
            // ascending order
            // return this.num - p2.num;

            // descending order
            return p2.num - this.num;
        }
    }

    public static void main(String[] args) {     // O (N log K)
        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;  // window size
        int[] result = new int[arr.length - k + 1];

        PriorityQueue<Pair> pq = new PriorityQueue<>();

        // 1st window
        for (int i = 0 ; i < k ; i++) {
            pq.add(new Pair(arr[i], i));
        }

        result[0] = pq.peek().num;

        for (int i = k ; i < arr.length ; i++) {
            // remove elements not in the current window
            while (!pq.isEmpty() && pq.peek().index <= (i - k)) {
                pq.remove();
            }

            pq.add(new Pair(arr[i], i));
            result[i - k + 1] = pq.peek().num;
        }

        // print result
        for (int i = 0 ; i < result.length ; i++) {
            System.out.print(result[i] + " ");
        }
    }
}