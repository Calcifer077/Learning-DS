// Elections

import java.util.*;

public class _1593A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            long max = Integer.MIN_VALUE;
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();
            max = Math.max(max, a);
            max = Math.max(max, b);
            max = Math.max(max, c);
            long arr[] = new long[3];

            if (a == max) {
                if (a != c && a != b) {
                    arr[0] = 0;
                } else {
                    arr[0] = 1;
                }
            } else {
                arr[0] = (max - a) + 1;
            }

            if (b == max) {
                if (b != a && b != c) {
                    arr[1] = 0;
                } else {
                    arr[1] = 1;
                }
            } else {
                arr[1] = (max - b) + 1;
            }

            if (c == max) {
                if (c != a && c != b) {
                    arr[2] = 0;
                } else {
                    arr[2] = 1;
                }
            } else {
                arr[2] = (max - c) + 1;
            }

            for (int i = 0; i < 3; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            t--;
        }
        sc.close();
    }
}
