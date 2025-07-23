public class IfNumberisPowerofTwo {
    public static boolean IsPowerOfTwo(int n) {
        return (n & (n-1)) == 0 ;
    }
    public static void main(String args[]) {
        System.out.println(IsPowerOfTwo(15));
    }
}
