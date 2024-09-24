import java.util.*;

public class _2014C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            long sum = 0;
            long arr[] = new long[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextLong();
                sum += arr[i];
            }

            Arrays.sort(arr);

            if (n < 3) {
                System.out.println(-1);
            } else {
                System.out.println(Math.max(0L, 2 * n * arr[n / 2] - sum + 1));
            }
            t--;
        }
        sc.close();
    }
}