import java.util.*;

public class MinAbsDiffPairs {
    public static void main(String[] args) { // O(nlog n) -- for sorting 'log n' and for loop 'n'
        int A[] = {1, 2, 3, 2, 1};
        int B[] = {2, 1, 3, 1, 3};

        Arrays.sort(A);
        Arrays.sort(B);

        int minDiff = 0;

        for (int i = 0 ; i < A.length ; i++) {
            minDiff += Math.abs(A[i] - B[i]);
        }

        System.out.println("Minimum Absolute Difference of Pairs : " + minDiff);
    }
}
