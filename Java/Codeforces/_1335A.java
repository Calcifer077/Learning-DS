// Candies and two sisters

import java.util.*;

public class _1335A {
    public static int solve(int n) {

        if (n % 2 == 0) {
            return (n / 2) - 1;
        } else {
            return n / 2;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            System.out.println(solve(n));
            t--;
        }

        sc.close();
    }
}
