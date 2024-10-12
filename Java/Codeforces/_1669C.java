// Odd/Even increments

import java.util.*;

public class _1669C {
    public static void solve(int arr[]) {
        boolean even = false;
        boolean odd = false;
        if (arr[0] % 2 == 0 && arr[1] % 2 == 0) {
            even = true;
        }

        if (arr[0] % 2 != 0 && arr[1] % 2 != 0) {
            odd = true;
        }

        if (even) {
            for (int i = 2; i < arr.length; i++) {
                if (arr[i] % 2 != 0) {
                    System.out.println("No");
                    return;
                }
            }
            System.out.println("Yes");
            return;
        }

        if (odd) {
            for (int i = 2; i < arr.length; i++) {
                if (arr[i] % 2 == 0) {
                    System.out.println("No");
                    return;
                }
            }
            System.out.println("Yes");
            return;
        }

        if (arr[0] % 2 == 0) {
            even = true;
        } else {
            odd = true;
        }

        if (even) {
            for (int i = 1; i < arr.length; i++) {
                if (i % 2 == 0 && arr[i] % 2 != 0) {
                    System.out.println("No");
                    return;
                }

                if (i % 2 != 0 && arr[i] % 2 == 0) {
                    System.out.println("No");
                    return;
                }
            }
        }

        if (odd) {
            for (int i = 1; i < arr.length; i++) {
                if (i % 2 == 0 && arr[i] % 2 == 0) {
                    System.out.println("No");
                    return;
                }

                if (i % 2 != 0 && arr[i] % 2 != 0) {
                    System.out.println("No");
                    return;
                }
            }
        }

        System.out.println("Yes");
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

            solve(arr);

            t--;
        }
        sc.close();
    }
}