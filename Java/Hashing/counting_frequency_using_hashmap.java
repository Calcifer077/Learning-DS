import java.util.*;

public class counting_frequency_using_hashmap {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int nums[] = { 1, 2, 3, 1, 2, 4, 4, 3 };
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }

        for (int i : map.keySet()) {
            System.out.println("Key " + i + " value " + map.get(i));
        }
    }
}
