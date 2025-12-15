import java.util.HashMap;
import java.util.Set;

public class Iteration {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("India", 100);
        map.put("China", 130);
        map.put("US", 70);
        map.put("Indonesia", 20);
        map.put("Nepal", 7);

        // Iterate
        Set<String> keys = map.keySet();
        System.out.println(keys);

        for (String k : keys) {
            System.out.println("key=" + k + "," + "value=" + map.get(k));
        }
    }
}
