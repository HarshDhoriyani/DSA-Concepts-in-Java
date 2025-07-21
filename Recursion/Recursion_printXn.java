public class Recursion_printXn {
    public static int pow(int x, int n) {
        if (n == 0) {
            return 1 ;
        }
        int xnm1 = pow(x, n-1);
        return x * xnm1 ;
    }
    public static void main(String args[]) {
        System.out.println(pow(2, 10));
    }
}
