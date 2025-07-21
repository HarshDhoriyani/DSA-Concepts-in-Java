import java.util.Scanner;

public class Recursion_Fibonacci {
    public static int fib(int n) {
        if(n == 0 || n == 1) {
            return n ;
        }
        int fibn_1 = fib(n-1) ;
        int fibn_2 = fib(n-2) ;
        int fibn = fibn_1 + fibn_2 ;
        return fibn ;
    }
    public static void main(String args[]) {
        System.out.println("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fib(n));
    }
}
// Output : 0 1 1 2 3 5--> 5Th Position 