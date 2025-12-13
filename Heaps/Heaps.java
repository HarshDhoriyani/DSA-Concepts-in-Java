
import java.util.ArrayList;

public class Heaps {
    public static class Heap {
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data) {  // O(log n)
            // add at last index
            arr.add(data);

            int x = arr.size()-1; // x is child index
            int par = (x - 1) / 2; // parent index;

            while (arr.get(x) < arr.get(par)) {  // Time Complexity: O(log n)
                // swap
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);

                x = par;
                par = ( x - 1 ) / 2;
            }
        }
        
        public int peek() {
            return arr.get(0);
        }

        private void heapify(int idx) {
            int left = 2 * idx + 1;
            int right = 2 * idx + 2;
            int minIdx = idx;

            // checking whether the node is leaf node or not and checking if minIndex is greater than left node then minindex will be the left node
            if (left < arr.size() && arr.get(minIdx) > arr.get(left)) {
                minIdx = left;
            }

            // checking whether the node is leaf node or not and checking if minindex is greater than right node then minindex will be the right node
            if (right < arr.size() && arr.get(minIdx) > arr.get(right)) {
                minIdx = right;
            }

            // If minindex is changed than swap the root with minindex value
            if (minIdx != idx) {
                // swap
                int temp = arr.get(idx); // root
                arr.set(idx, arr.get(minIdx));
                arr.set(minIdx, temp);

                heapify(minIdx);
            }
        }

        public int delete() {
            int data = arr.get(0);

            // S1: swap first and last
            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size()-1));
            arr.set(arr.size()-1, temp);

            // S2: Delete last element
            arr.remove(arr.size()-1);

            // S3: heapify() --> Fix my heap
            heapify(0); // root
            return data;
        }

        public boolean isEmpty() {
            return arr.size() == 0;
        }
        
    }
    public static void main(String[] args) {
        Heap h = new Heap();
        h.add(3);
        h.add(4);
        h.add(1);
        h.add(5);

        while (!h.isEmpty()) { 
            System.out.println(h.peek());
            h.delete();
        }
    }
}
