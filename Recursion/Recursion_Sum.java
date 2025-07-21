public class Recursion_Sum {
    public static int sum(int n) {
        if (n == 1) {
            return 1;
        }
        sum(n-1) ;
        int sumofn = n + sum(n-1);
        return sumofn;
    }
    public static void main(String args[]) {
        int n = 5 ;
        System.out.println(sum(n));
    }
}
