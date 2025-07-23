public class ClearLastIbits {
    public static int clearIbits(int n , int i) {
        int BitMask = (~0)<<i ; //~0 == -1
        return n & BitMask ;
    }
    public static void main(String args[]) {
        System.out.println(clearIbits(15, 2));
    }
}
