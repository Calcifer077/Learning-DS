// Eating queries

import java.util.*;

public class _1676E {
    public static void reverse(int arr[]) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int candies[] = new int[n];
            long query[] = new long[k];

            for (int i = 0; i < n; i++) {
                candies[i] = sc.nextInt();
            }

            for (int i = 0; i < k; i++) {
                query[i] = sc.nextLong();
            }

            Arrays.sort(candies);
            reverse(candies);

            int prefixSum[] = new int[n];
            prefixSum[0] = candies[0];
            for (int i = 1; i < n; i++) {
                prefixSum[i] = candies[i] + prefixSum[i - 1];
            }

            for (int i = 0; i < k; i++) {
                int ans = -1;
                int left = 0;
                int right = n - 1;

                while (left <= right) {
                    int mid = (left + right) / 2;
                    if (prefixSum[mid] >= query[i]) {
                        ans = mid + 1;
                        right = mid - 1;
                    } else {
                        left = mid + 1;
                    }
                }

                System.out.println(ans);
            }
            t--;
        }
        sc.close();
    }
}