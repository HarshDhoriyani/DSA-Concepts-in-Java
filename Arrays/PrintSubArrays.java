import java.util.Scanner;

public class PrintSubArrays {

    public static void printSubarrays(int numbers[]) {
        int ts = 0; // Total subarrays

        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;

                for (int k = start; k <= end; k++) {
                    System.out.print(numbers[k] + " ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }

        System.out.println("Total Number of Subarrays: " + ts);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements in the array: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Array must contain at least 1 element.");
            return;
        }

        int[] numbers = new int[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.println("Subarrays are:");
        printSubarrays(numbers);

        sc.close();
    }
}
