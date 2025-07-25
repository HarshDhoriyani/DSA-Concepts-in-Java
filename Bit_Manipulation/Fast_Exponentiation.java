public class Fast_Exponentiation {
    public static int fastExponentiation(int a , int n) {
        // a = base and n = power
        int ans = 1 ;
        while(n > 0) {
            if ((n & 1) != 0) { //check LSB
                ans = ans * a ;
            }
            a = a*a ;
            n = n>>1 ;
        }
        return ans ;
    }
    public static void main(String args[]) {
        System.out.println(fastExponentiation(3,5));
    }
}
