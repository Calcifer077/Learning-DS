import java.util.*;

public class _2003B {
    public static int solve(int arr[], int n) {
        Arrays.sort(arr);
        // int res = n / 2;
        return arr[(n) / 2];
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
            if (n < 2) {
                System.out.println(arr[0]);
            } else {
                System.out.println(solve(arr, n));
            }
            t--;
        }
        sc.close();

    }
}
