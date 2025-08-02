import java.util.ArrayList;
public class intro {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        // Add operations
        list.add(1);  // O(1)
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println(list);

        // Get operations
        int element = list.get(3);
        System.out.println(element);

        // Remove operations
        list.remove(3);
        System.out.println(list);

        // Set operation
        list.set(2, 10);
        System.out.println(list);

        // Contains operation
        System.out.println(list.contains(2));
        System.out.println(list.contains(6));
        
        // Size 
        System.out.println(list.size());

        
        
        ArrayList<Integer> list2 = new ArrayList<>();
        // Assigning values 
        for (int i = 0 ; i<=5; i++) {
            list2.add(i);
        }

        // Reverse the list2
        for(int i = list2.size()-1 ; i >= 0 ; i--) {
            System.out.print(list2.get(i) + " ");
        }
    }
}