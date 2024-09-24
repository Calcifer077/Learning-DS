import java.util.*;

public class _2104A {
    public static int solve(int arr[], int n, int k) {
        int personHelp = 0;
        int robin = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] >= k) {
                robin += arr[i];
            }

            if (arr[i] == 0 && robin >= 1) {
                robin = robin - 1;
                personHelp++;
            }
        }
        return personHelp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            int arr[] = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.println(solve(arr, n, k));
            t--;
        }
        sc.close();
    }
}