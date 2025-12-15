import java.util.LinkedHashMap;

public class LinkedHashMapCode {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        lhm.put("Harsh", 99);
        lhm.put("Raj", 100);
        lhm.put("Urmila", 95);
        lhm.put("Bharat", 98);
        System.out.println(lhm);
    }
}
