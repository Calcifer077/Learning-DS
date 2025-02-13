package Java.Greedy;

import java.util.Arrays;
import java.util.Comparator;

public class activity_selection {
    // if end time are sorted.
    // public static int selectActivites(int start[], int end[]) {
    // int res = 1;

    // int min = end[0];
    // for (int i = 1; i < start.length; i++) {
    // if (start[i] >= min) {
    // min = end[i];
    // res++;
    // }
    // }

    // return res;
    // }

    // if end times are not sorted
    public static int selectActivites(int start[], int end[]) {
        int res = 1;

        int activities[][] = new int[start.length][3];

        for (int i = 0; i < start.length; i++) {
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }

        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));

        int min = activities[0][2];
        for (int i = 1; i < start.length; i++) {
            if (activities[i][1] >= min) {
                min = activities[i][2];
                res++;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int start[] = { 1, 3, 0, 5, 5, 8 };
        int end[] = { 2, 4, 6, 7, 9, 9 };

        System.out.println(selectActivites(start, end));
    }
}
