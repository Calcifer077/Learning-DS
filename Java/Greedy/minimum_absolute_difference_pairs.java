package Java.Greedy;

import java.util.Arrays;

public class minimum_absolute_difference_pairs {

    public static int solve(int a[], int b[]) {
        int ans = 0;
        Arrays.sort(a);
        Arrays.sort(b);

        for (int i = 0; i < a.length; i++) {
            ans += Math.abs(a[i] - b[i]);
        }
        return ans;
    }

    public static void main(String[] args) {
        int a[] = { 1, 2, 3 };
        int b[] = { 2, 1, 3 };

        System.out.println(solve(a, b));
    }
}
