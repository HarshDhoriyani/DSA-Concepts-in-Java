
import java.util.HashSet;

public class IterationHashSet {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();

        cities.add("Pune");
        cities.add("Mumbai");
        cities.add("Rajkot");
        cities.add("Morbi");

        // Using Iterators
        // Iterator it = cities.iterator();
        // while (it.hasNext()) {
        //     System.out.println(it.next());
        // }

        // Using Advanced Loops
        for (String city : cities) {
            System.out.println(city);
        }
    }
}
