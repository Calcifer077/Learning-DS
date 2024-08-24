// Primary task

import java.util.*;

public class _2000A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int num = sc.nextInt();

            boolean res = false;
            if (num > 101 && num <= 109) {
                res = true;
            } else if (num >= 1010 && num <= 1099) {
                res = true;
            }

            if (res == true) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            t--;
        }
        sc.close();
    }
}
