import java.util.*;

public class _1458A {

    public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            int a[] = new int[n];
            int b[] = new int[m];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            for (int i = 0; i < m; i++) {
                b[i] = sc.nextInt();
            }

            int g = 0;
            for (int i = 1; i < n; i++) {
                g = gcd(g, Math.abs(a[0] - a[i]));
            }

            for (int i = 0; i < m; i++) {
                System.out.print(gcd(g, a[0] + b[i]) + " ");
            }
            t--;
        }
        sc.close();
    }
}