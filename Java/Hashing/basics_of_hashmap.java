import java.util.*;

public class basics_of_hashmap {
    public static void main(String[] args) {
        // Creation
        HashMap<String, Integer> map = new HashMap<>();

        // Insertion - O(1)
        map.put("India", 1);
        map.put("China", 2);
        map.put("USA", 3);

        System.out.println(map);

        // Getting a value with respect to some key - O(1)
        int rank = map.get("India");
        System.out.println(rank);

        // will return null
        // System.out.println(map.get("INdia"));

        // Conatins key - returns a boolean based on whether a map contains a key or
        // not. O(1)
        System.out.println(map.containsKey("India"));

        // Remove - Returns value of that key which you want to remove and then removes
        // that value from the hashmap.
        // If your hashmap doesn't contain that pair it will return
        // O(1)
        System.out.println(map.remove("China"));
        System.out.println(map.remove("China"));

        // Size
        System.out.println(map.size());

        // IsEmpty
        System.out.println(map.isEmpty());

        // clear -> empties the entire map
        map.clear();
    }
}
