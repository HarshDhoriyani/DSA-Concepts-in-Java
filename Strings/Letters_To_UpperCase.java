public class Letters_To_UpperCase {
    public static String lettersToUppercase(String str) {
        StringBuilder sb = new StringBuilder("") ;

        char ch = Character.toUpperCase(str.charAt(0)) ;
        sb.append(ch);

        for(int i = 1 ; i<str.length() ; i++) {
            if(str.charAt(i) == ' ' && i<str.length()-1) {
                sb.append(str.charAt(i));
                i++ ;
                sb.append(Character.toUpperCase(str.charAt(i))) ;
            } else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String args[]) {
        String str = "hi, i am harsh" ;
        System.out.println(lettersToUppercase(str));
    }
}
//Time Complexity -- O(n) -- Linear