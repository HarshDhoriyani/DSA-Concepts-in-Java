public class FindSubsets {
    public static void subsets(String str, String ans, int i) {
        //base case
        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.println("Null");
            }
            else {
                System.out.println(ans);
            }
            return;
        }

        // recursion
        // Yes choice
        subsets(str, ans+str.charAt(i), i+1);

        // No choice
        subsets(str, ans, i+1);

    }

    public static void main(String[] args) {
        String a = "abc";
        subsets(a, "", 0);
    }
}
