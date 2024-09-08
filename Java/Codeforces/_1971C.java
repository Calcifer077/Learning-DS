// Clock and strings

import java.util.*;

public class _1971C {
    public static void solve(int a, int b, int c, int d) {
        Boolean res = false;

        int min = Math.min(a, b);
        int max = Math.max(a, b);
        if ((min < c && c < max) && !(min < d && d < max)) {
            res = true;
        } else if (!(min < c && c < max) && (min < d && d < max)) {
            res = true;
        }

        if (res) {
            System.out.println("YES");
            return;
        } else {
            System.out.println("NO");
            return;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();

            solve(a, b, c, d);
            t--;
        }
        sc.close();
    }
}
