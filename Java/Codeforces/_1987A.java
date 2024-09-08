// Upload more ram

import java.util.*;

public class _1987A {
    public static int solve(int n, int k) {
        if (k == 1 || n == 1) {
            return n;
        }

        return (k * (n - 1)) + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            System.out.println(solve(n, k));
            t--;
        }
        sc.close();
    }
}