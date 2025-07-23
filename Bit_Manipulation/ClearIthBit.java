public class ClearIthBit {
    public static int clearIthbit(int n , int i) {
        int BitMask = ~(1<<i) ;
        return n & BitMask ;
    }
    public static void main(String[] args) {
        System.out.println(clearIthbit(10, 1)) ;
    }
}
