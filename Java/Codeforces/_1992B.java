// Angry monk

import java.util.*;

public class _1992B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            int arr[] = new int[k];

            int max = 0;
            for (int i = 0; i < k; i++) {
                arr[i] = sc.nextInt();
                max = Math.max(arr[i], max);
            }

            Arrays.sort(arr);
            int count = 0;
            for (int i = 0; i < k - 1; i++) {
                if (arr[i] != 1) {
                    count = count + arr[i] + (arr[i] - 1);
                } else {
                    count = count + 1;
                }
            }

            System.out.println(count);
            t--;
        }
        sc.close();
    }
}