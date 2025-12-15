import java.util.HashMap;

public class Basics {
    public static void main(String[] args) {
        
        // Country-Population HashMap
        HashMap<String, Integer> hm = new HashMap<>();

        // Insert - O(1)
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("Nepal", 20);
        hm.put("Russia", 70);

        // System.out.println(hm);

        // // Get - O(1)
        // int population = hm.get("Nepal");
        // System.out.println(population);

        // // ContainsKey - O(1)
        // System.out.println(hm.containsKey("India")); // true
        // System.out.println(hm.containsKey("USA"));  // false

        // // Remove - O(1)
        // hm.remove("India");
        // System.out.println(hm);

        // Size - O(1)
        System.out.println(hm.size());

        // isEmpty - O(1)
        System.out.println(hm.isEmpty());

        // clear - O(1)
        hm.clear();
        System.out.println(hm.isEmpty());
        System.out.println(hm);
    }
}
