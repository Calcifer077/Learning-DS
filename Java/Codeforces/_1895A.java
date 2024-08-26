// Treeasure chest

import java.util.*;

public class _1895A {
    public static int solve(int x, int y, int k) {
        if (x > y) {
            return x;
        } else {
            int res = y - x;
            if (res <= k) {
                return y;
            } else {
                return y + y - (x + k);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int k = sc.nextInt();
            System.out.println(solve(x, y, k));
            t--;
        }
        sc.close();
    }
}
