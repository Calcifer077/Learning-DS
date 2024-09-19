import java.util.*;

public class maximum_in_arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(21);
        list.add(33);
        list.add(40);
        list.add(5);

        Integer max = Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++) {
            max = Math.max(max, list.get(i));
        }

        System.out.println(max);
    }
}
