public class SetIthBit {
    public static int setIthbit(int n , int i) {
        int BitMask = 1<<i ;
        return n | BitMask ;
    }    
    public static void main(String[] args) {
        System.out.println(setIthbit(10, 2));
    }
}
