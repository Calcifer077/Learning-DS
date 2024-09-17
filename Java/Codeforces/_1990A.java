// Submission bait

import java.util.*;

public class _1990A {
    public static void solve(int arr[], int n) {
        int fre[] = new int[n];
        int visited = -1;
        for (int i = 0; i < n; i++) {
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    fre[j] = visited;
                }
            }

            if (fre[i] != visited) {
                fre[i] = count;
            }
        }

        for (int i = 0; i < fre.length; i++) {
            if (fre[i] != visited) {
                if (fre[i] % 2 == 1) {
                    System.out.println("YES");
                    return;
                }
            }
        }
        System.out.println("NO");
    }

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
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            solve(arr, n);
            t--;
        }
        sc.close();
    }
}