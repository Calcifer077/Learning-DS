// maximum multiple sum

import java.util.*;

public class _1985B {
    public static int multiplesSum(int n) {
        int sum = Integer.MIN_VALUE;
        int result = 0;
        for (int i = 2; i <= n; i++) {
            int j = i;
            int res = 0;
            while (j <= n) {
                res += j;
                j = j + i;
            }
            if (sum < res) {
                sum = res;
                result = i;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t > 0) {
            int n = sc.nextInt();
            System.out.println(multiplesSum(n));
            t--;
        }

        sc.close();
    }
}
