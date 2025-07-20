public class String_Builder {
    //STRING BUILDER -- String Builder class is used create mutable String objects. It is same as String but String Builder is mutable datatype i.e., it can change value.
    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder("Hello") ;
        //append() method concatenates the given argument with this String
        sb.append("Java") ;
        System.out.println(sb);
        
    }
}