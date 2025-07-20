import java.util.*;
public class Basics_Strings {
    public static void Printcharacters(String str) {
        for (int i = 0 ; i<str.length() ; i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }
    public static void main(String args[]) {
        String str = "Abckd" ;
        String str2 = new String("absc@#%14") ;
    
        //String -- Input/Output
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter a string: ");
        String name ;
        name = sc.nextLine() ;
        System.out.println(name);

        //String Length
        String fullname = "Tony Stark" ;
        System.out.println(fullname.length());
        
        //String Concatenation
        String firstname = "Harsh" ;
        String lastname = "Dhoriyani" ;
        String Fullname = firstname + " " + lastname ;
        System.out.println(Fullname);
        
        //String charAt function
        System.out.println(Fullname.charAt(3));
        Printcharacters(Fullname) ;
    }
}
