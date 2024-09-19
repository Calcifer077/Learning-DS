import java.util.*;;

public class iteration_on_hashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("india", 1);
        map.put("china", 2);
        map.put("germany", 3);
        map.put("russia", 4);
        map.put("france", 5);

        // Iteration
        Set<String> keys = map.keySet();

        for (String k : keys) {
            System.out.println("keys = " + k + ", value = " + map.get(k));
        }
    }
}
