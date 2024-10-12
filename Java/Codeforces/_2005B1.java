import java.util.*;

public class _2005B1 {
    public static void solve(long arr[], long d, long n) {
        Arrays.sort(arr);
        if (d < arr[0]) {
            System.out.println(arr[0] - 1);
            return;
        }
        if (d > arr[1]) {
            System.out.println(n - arr[1]);
            return;
        }
        long mid = (arr[0] + arr[1]) / 2;
        long t1 = mid - arr[0], t2 = arr[1] - mid;
        System.out.println(Math.min(t1, t2));
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            long m = sc.nextLong();
            long q = sc.nextLong();

            long[] arr = new long[(int) m];
            for (int i = 0; i < m; i++) {
                arr[i] = sc.nextLong();
            }

            long d = sc.nextLong();
            solve(arr, d, n);
        }
        sc.close();
    }
}