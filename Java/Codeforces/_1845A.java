// Foridden integer

import java.util.*;

public class _1845A {
    // In this question, we are given a number 'n' which we have to form by adding
    // different numbers given, 'k' is basically the upper bound of the number you
    // can take to form the sum without including 'x'.
    // Suppose 'n' = 10 , 'k' = 3, 'x' = 2. It means you can take 1 and 3 to form 10
    // but not 2.

    // If x is not equal to 1 we can simply print 1 'n' times.
    // If k is 1 and x is not equal to 1. We can't do it because you can only take 1
    // which is not allowes
    // If k is 2 and n is odd. You can't do it as only possible value is 2 which
    // can't form a odd number.
    // For every other case, Check if number is odd or even. If it even simply print
    // 2 n/2 times.
    // Else print first print 3 and rest 2.
    public static void solve(int n, int k, int x) {
        if (x != 1) {
            System.out.println("YES");
            System.out.println(n);
            for (int i = 0; i < n; i++) {
                System.out.println(1);
            }
            return;
        }

        if (k == 1) {
            System.out.println("NO");
            return;
        }

        if (k == 2 && n % 2 == 1) {
            System.out.println("NO");
            return;
        }

        if (n % 2 == 0) {
            System.out.println("YES");
            System.out.println(n / 2);
            System.out.println(2);
            for (int i = 1; i < n / 2; i++) {
                System.out.println(2);
            }
            return;
        } else {
            System.out.println("YES");
            System.out.println(n / 2);
            System.out.println(3);
            for (int i = 1; i < n / 2; i++) {
                System.out.println(2);
            }
            return;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int x = sc.nextInt();

            solve(n, k, x);
            t--;
        }
        sc.close();
    }
}