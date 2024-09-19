import java.util.*;

public class container_with_most_water {
    public static void main(String[] args) {
        // int h[] = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);
        int res = 0;
        // Brute force
        // for (int i = 0; i < list.size(); i++) {
        // for (int j = i + 1; j < list.size(); j++) {
        // int sol = Math.min(list.get(i), list.get(j));
        // res = Math.max(res, sol * (j - i));
        // }
        // }

        // Two pointer approach
        int lp = 0;
        int rp = list.size() - 1;
        while (lp < rp) {
            int height = Math.min(list.get(lp), list.get(rp));
            int width = rp - lp;
            int currWater = height * width;
            res = Math.max(res, currWater);

            if (list.get(lp) > list.get(rp)) {
                rp--;
            } else {
                lp++;
            }
        }

        System.out.println(res);
    }
}
