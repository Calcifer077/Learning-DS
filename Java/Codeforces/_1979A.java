// Guess the maximum

import java.util.*;

public class _1979A {
    public static int solve(int arr[]) {

        int newArr[] = new int[arr.length - 1];
        for (int i = 0; i < arr.length - 1; i++) {
            newArr[i] = Math.max(arr[i], arr[i + 1]);
        }

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < newArr.length; i++) {
            min = Math.min(min, newArr[i]);
        }

        return min - 1;
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

            System.out.println(solve(arr));
            t--;
        }
        sc.close();
    }
}