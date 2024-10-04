// Painting the ribbon

import java.util.*;

public class _1954A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();

            int a = (n + m - 1) / m;
            if (a + k >= n) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
            t--;
        }
        sc.close();
    }
}