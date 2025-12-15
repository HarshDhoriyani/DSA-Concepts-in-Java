
import java.util.HashMap;

public class LargestSubArraySumZero {
    public static void main(String[] args) {   // O(n)
        int arr[] = {-31, -48, -90, 54, 20, 95, 6, -86, 22};
        HashMap<Integer, Integer> map = new HashMap<>();
        // (sum, idx);
        int sum = 0;
        int len = 0;

        for (int j = 0 ; j < arr.length; j++) {
            sum += arr[j];

            if (sum == 0) {
                len = j + 1;
            }
            
            if (map.containsKey(sum)) {
                len = Math.max(len, j - map.get(sum));
            }
            else {
                map.put(sum, j);
            }
        }

        System.out.println("Largest Subarray with Sum as Zero = " + len);
    }
}
