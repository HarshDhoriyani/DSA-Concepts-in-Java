import java.util.Scanner;

public class Pairs_Arrays {

    public static void Printpairs(int numbers[]) {
        for (int i = 0; i < numbers.length; i++) {
            int curr = numbers[i];  // current number
            for (int j = i + 1; j < numbers.length; j++) {
                System.out.print("(" + curr + "," + numbers[j] + ") ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements in the array: ");
        int n = sc.nextInt();

        if (n <= 1) {
            System.out.println("Need at least 2 elements to form pairs.");
            return;
        }

        int[] numbers = new int[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.println("The pairs are: ");
        Printpairs(numbers);

        sc.close();
    }
}
