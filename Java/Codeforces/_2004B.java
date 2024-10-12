// Game with Doors

import java.util.*;

public class _2004B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            int L = sc.nextInt();
            int R = sc.nextInt();

            int left = Math.max(l, L);
            int leftNot = Math.min(l, L);

            int right = Math.min(r, R);
            int rightNot = Math.max(r, R);

            if (l == L && r == R) {
                System.out.println(right - left);
            } else if (left > right) {
                System.out.println(1);
            } else if (left != leftNot && right != rightNot) {
                System.out.println(right - left + 2);
            } else {
                System.out.println((right - left) + 1);
            }
            t--;
        }
        sc.close();
    }
}