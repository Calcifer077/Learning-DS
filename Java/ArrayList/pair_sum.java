import java.util.*;

public class pair_sum {
    // Sorted
    public static boolean solveForSorted(ArrayList<Integer> list, int target) {
        int lp = 0;
        int rp = list.size() - 1;
        while (lp < rp) {
            int sum = list.get(rp) + list.get(lp);
            if (sum == target) {
                return true;
            } else if (sum > target) {
                rp--;
            } else {
                lp++;
            }
        }
        return false;
    }

    // Sorted and rotated
    // public static boolean solveForSortedAndRotated(ArrayList<Integer> list, int
    // target) {
    // int pivot = -1;
    // for (int i = 0; i < list.size() - 1; i++) {
    // if (list.get(i) > list.get(i + 1)) {
    // pivot = i;
    // break;
    // }
    // }

    // int lp = pivot + 1;
    // int rp = pivot;

    // while (lp != rp) {
    // int sum = list.get(rp) + list.get(lp);
    // if (sum == target) {
    // return true;
    // } else if (sum > target) {
    // if (rp == 0) {
    // rp = list.size() - 1;
    // } else {
    // rp--;
    // }
    // } else {
    // if (lp == list.size() - 1) {
    // lp = 0;
    // } else {
    // lp++;
    // }
    // }
    // }
    // return false;
    // }

    public static boolean solveForSortedAndRotated(ArrayList<Integer> list, int target) {

        int bp = -1;
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) > list.get(i + 1)) {
                bp = i;
                break;
            }
        }

        int lp = bp + 1;
        int rp = bp;

        while (lp != rp) {
            int sum = list.get(rp) + list.get(lp);
            if (sum == target) {
                return true;
                // Below what we have done is known as modulo arithmetic
            } else if (sum > target) {
                rp = (list.size() + rp - 1) % list.size();
            } else {
                lp = (lp + 1) % list.size();
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // int target = 50;
        // System.out.println(solveForSorted(list, target));

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(11);
        list2.add(15);
        list2.add(6);
        list2.add(8);
        list2.add(9);
        list2.add(10);

        System.out.println(solveForSortedAndRotated(list2, 16));
    }
}
