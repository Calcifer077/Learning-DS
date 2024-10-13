// Most similar words

import java.util.*;

public class _1676C {
    public static int solve(String str1, String str2, int m) {
        int res = 0;
        for (int i = 0; i < m; i++) {
            res += Math.abs(str1.charAt(i) - str2.charAt(i));
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            String[] str = new String[n];

            for (int i = 0; i < n; i++)
                str[i] = sc.next();

            int min = Integer.MAX_VALUE;

            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    min = Math.min(min, solve(str[i], str[j], m));
                }
            }

            System.out.println(min);
            t--;
        }
        sc.close();
    }
}