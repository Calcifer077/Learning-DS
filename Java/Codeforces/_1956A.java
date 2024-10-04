// Nene's game

import java.util.*;

public class _1956A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int k = sc.nextInt();
            int n = sc.nextInt();

            int arr[] = new int[k];
            int q[] = new int[n];

            for (int i = 0; i < k; i++) {
                arr[i] = sc.nextInt();
            }

            for (int i = 0; i < n; i++) {
                q[i] = sc.nextInt();
            }

            for (int i = 0; i < n; i++) {
                System.out.print(Math.min(arr[0] - 1, q[i]) + " ");
            }
            System.out.println();
            t--;
        }
        sc.close();
    }
}
