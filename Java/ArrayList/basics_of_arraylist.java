// Arraylist comes under Java collection framework

import java.util.*;

public class basics_of_arraylist {
    public static void main(String[] args) {
        // 'list' is the name of the arraylist
        // 'Integer' tells about the data of the arraylist.
        ArrayList<Integer> list = new ArrayList<>();

        // Adding a element to a list. Time complexity -> O(1)
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);

        // This add method will add any element into the array list and make every other
        // element after it to go one step back. '1' is index and '9' is value
        // list.add(1, 9);

        // Get operation -> O(1)
        // '2' is index
        // System.out.println(list.get(2));

        // Delete -> O(n). It takes linear time because we have to go to that index and
        // remove it
        // list.remove(2);
        // System.out.println(list);

        // Set -> Set a element at a particular index -> O(n)
        // list.set(2, 10);
        // System.out.println(list);

        // contains -> Checks if a element is in a list or not. -> O(n)
        System.out.println(list.contains(1));

        // To get size of arraylist
        System.out.println(list.size());
    }
}
