public class Recursion_printXn_Optimized {
    public static int pow (int x, int n) {
        if (n == 0) {
            return 1;
        }
        int halfPower = pow(x, n/2) ;
        int halfpowerSq = halfPower * halfPower ;
        if (n % 2 != 0) {
            halfpowerSq = x * halfpowerSq;
        }
        return halfpowerSq;
    }
    public static void main(String args[]) {
        int x = 2 ;
        int n = 10 ;
        System.out.println(pow(x, n));
    }
}
//Time Complexity : O(log n)