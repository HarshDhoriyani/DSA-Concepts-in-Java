public class Recursion_IncreasingNos {
    public static void main(String args[]) {
        int n = 5;
        printincreasing(n);
    }
    public static void printincreasing(int n) {
        if (n == 0) {
            return;
        }
        printincreasing(n-1);
        System.out.print(n + " ");  
    }
}
// output : 1 2 3 4 5