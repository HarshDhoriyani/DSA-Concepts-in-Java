
import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetCode {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();

        cities.add("Pune");
        cities.add("Mumbai");
        cities.add("Rajkot");
        cities.add("Morbi");

        System.out.println(cities);

        LinkedHashSet<String> lhs = new LinkedHashSet<>();

        lhs.add("Pune");
        lhs.add("Mumbai");
        lhs.add("Rajkot");
        lhs.add("Morbi");

        System.out.println(lhs);
    }
}
