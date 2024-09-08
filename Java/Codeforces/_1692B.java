// All distinct

import java.util.*;

public class _1692B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            for (int i = 0; i < n; i++) {
                for (int k = i + 1; k < n; k++) {
                    if (arr[i] == arr[k]) {
                        if (arr[i] != 0 && arr[k] != 0) {
                            arr[k] = 0;
                        }
                    }
                }
            }

            int count = 0;
            // Counted the number of distinct elemnt
            for (int i = 0; i < n; i++) {
                if (arr[i] != 0) {
                    count++;
                }
            }

            // In each operation we have to delete two elements
            // If the number of distinct element minus total number of elemments is even. It
            // means that we have done the deletion according to rule else we will just
            // increase the number of deletion by 1.
            if ((n - count) % 2 == 0) {
                System.out.println(count);
            } else {
                System.out.println(count - 1);
            }
            t--;
        }
        sc.close();
    }
}