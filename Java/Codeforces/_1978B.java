// New bakery

import java.util.*;

public class _1978B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            long n = sc.nextInt();
            long a = sc.nextInt();
            long b = sc.nextInt();

            if (a >= b) {
                System.out.println(n * a);
            } else {
                long k = Math.min(b - a + 1, n);
                System.out.println((b - k + 1) * n + k * (k - 1) / 2);
            }
            t--;
        }
        sc.close();
    }
}
