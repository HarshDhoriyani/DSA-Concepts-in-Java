public class CountSetBits {
    public static int countsetBits(int n) {
        int count = 0 ;
        while (n > 0) {
            if ((n & 1) != 0) {
                count++ ;
            }
            n = n>>1;
        }
        return count ;
    }
    public static void main(String args[]) {
        System.out.println(countsetBits(15));
    }
}
