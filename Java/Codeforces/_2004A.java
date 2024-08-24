// Closest point

import java.util.*;

public class _2004A {
    public static void closestPoint(int arr[]) {
        if (arr.length == 2) {
            if (arr[0] == arr[1]) {
                System.out.println("NO");
                return;
            } else if ((arr[1] == (arr[0] + 1)) || (arr[0] == (arr[1] + 1))) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        } else {
            System.out.println("NO");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            closestPoint(arr);

            t--;
        }

        sc.close();
    }
}
