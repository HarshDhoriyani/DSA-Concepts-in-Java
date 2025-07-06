import java.util.Scanner;

public class Max_SubArraySum_2 {
    public static void Max_SubArraySum(int numbers[]) {
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];

        // Create prefix sum array
        prefix[0] = numbers[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + numbers[i];
        }

        // Find max subarray sum using prefix sums
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {  
                int end = j;
                currsum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
                System.out.println("Sum from index " + start + " to " + end + " = " + currsum);
                if (maxsum < currsum) {
                    maxsum = currsum;
                }
            }
        }

        System.out.println("Max Sum is: " + maxsum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements in the array: ");
        int n = sc.nextInt();

        int[] numbers = new int[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        Max_SubArraySum(numbers);

        sc.close();
    }
}

// Time Complexity : O(n^2)