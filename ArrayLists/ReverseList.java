
import java.util.ArrayList;

public class ReverseList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // Assigning values to the list
        for (int i = 0 ; i<5; i++) {
            list.add(i);
        }

        System.out.println("Original List : ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

        System.out.println("\nReversed List : ");
        for (int i = list.size()-1 ; i>=0 ; i--) {
            System.out.print(list.get(i) + " ");
        }


    }
}
