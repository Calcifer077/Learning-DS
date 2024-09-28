// Square or not

import java.util.*;

public class _2008B {
    public static void solve(String str, int n) {
        char[] ch = str.toCharArray();
        if (n == 4) {
            for (int i = 0; i < 4; i++) {
                if (ch[i] != '1') {
                    System.out.println("No");
                    return;
                }
            }
            System.out.println("Yes");
            return;
        }

        int idx = 0;
        for (int i = 0; i < n; i++) {
            if (ch[i] == '0') {
                idx = i;
                break;
            }
        }

        if ((idx - 1) * (idx - 1) == n) {
            System.out.println("Yes");
            return;
        }

        System.out.println("No");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            solve(s, n);

            t--;
        }
        sc.close();
    }
}
