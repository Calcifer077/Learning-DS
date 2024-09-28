// Alice and books

import java.util.*;

public class _1978A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int max = Integer.MIN_VALUE;
            for (int i = 0; i < n - 1; i++) {
                max = Math.max(arr[i], max);
            }

            System.out.println(max + arr[n - 1]);
            t--;
        }
        sc.close();
    }
}
