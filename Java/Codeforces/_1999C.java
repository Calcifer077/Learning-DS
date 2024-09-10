// Showering

// In this question, you will be given three integers.
// n -> Number of tasks
// s -> time it takes to take a shower
// m -> total minutes
// You will be given 'n' taks with their starting and ending time stamp.
// You have to find if there is enough time to take a bath between, before or after tasks.
// Before -> Minus 0 from the first element of the first task
// After -> Minus last element or ending timestamp from 'm' total minutes in a day
// Between -> Minus each tasks ending timestamp form the succsessive starting timestamp. Exculde first and last timestamp as they are already included in the above cases.
// Ouput the max of them all and compare it to the time it takes to take a shower.

import java.util.*;

public class _1999C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int s = sc.nextInt();
            int m = sc.nextInt();
            int arr[] = new int[n * 2];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }

            int res = 0;
            res = Math.max(res, arr[0] - 0);
            res = Math.max(res, m - arr[arr.length - 1]);

            for (int i = 1; i < arr.length - 1; i++) {
                if (i % 2 == 0) {
                    res = Math.max(res, arr[i] - arr[i - 1]);
                }
            }

            if (res >= s) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            t--;
        }
        sc.close();
    }
}