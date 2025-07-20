import java.util.Scanner;

public class Palindrome {
    public static boolean checkPalindrome(String str) {
        int n = str.length() ;
        for (int i = 0 ; i<n/2 ; i++) {
            if (str.charAt(i) != str.charAt(n-i-1)) {
                System.out.println(str + " is not palindrome word ");
                return false ;
            }
        }
        System.out.println(str + " is palindrome word ");
        return true ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        checkPalindrome(str);
        sc.close();
    }
}
// Time Complexity = O(n) -- linear 
