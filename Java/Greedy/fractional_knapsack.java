package Java.Greedy;

import java.util.Arrays;
import java.util.Comparator;

public class fractional_knapsack {
    public static int solve(float weight[], float profit[], int max) {
        int ans = 0;
        float ratio[] = new float[profit.length];
        for (int i = 0; i < profit.length; i++) {
            ratio[i] = profit[i] / weight[i];
        }

        float items[][] = new float[profit.length][3];
        for (int i = 0; i < profit.length; i++) {
            items[i][0] = profit[i];
            items[i][1] = weight[i];
            items[i][2] = ratio[i];
        }

        Arrays.sort(items, Comparator.comparingDouble(o -> o[2]));
        int i = profit.length - 1;
        while (max > 0 && i >= 0) {
            if (items[i][1] <= max) {
                ans += items[i][0];
                max -= items[i][1];
            } else {
                ans += items[i][2] * max;
                max = 0;
            }
            i--;
        }
        return ans;
    }

    public static void main(String[] args) {
        float profit[] = { 60, 100, 120 };
        float weight[] = { 10, 20, 30 };
        int max = 50;
        System.out.println(solve(weight, profit, max));
    }
}