import java.util.Scanner;

public class Max_SubArraySum_3 {

    // KADANE'S ALGORITHM
    public static void max_subarraySum(int numbers[]) {
        if (numbers.length == 0) {
            System.out.println("Array is empty. No subarray sum possible.");
            return;
        }

        int currSum = numbers[0];
        int maxSum = numbers[0];

        // Optional: track start and end indices of max subarray
        int start = 0, end = 0, tempStart = 0;

        for (int i = 1; i < numbers.length; i++) {
            if (currSum + numbers[i] < numbers[i]) {
                currSum = numbers[i];
                tempStart = i;
            } else {
                currSum += numbers[i];
            }

            if (currSum > maxSum) {
                maxSum = currSum;
                start = tempStart;
                end = i;
            }

            System.out.println("Current sum at index " + i + ": " + currSum);
        }

        System.out.println("Max sum is: " + maxSum);
        System.out.print("Subarray with max sum: ");
        for (int i = start; i <= end; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements in the array: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid input. Array size must be > 0.");
            return;
        }

        int[] numbers = new int[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        max_subarraySum(numbers);

        sc.close();
    }
}
