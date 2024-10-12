import java.util.*;

public class _2021A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            Arrays.sort(arr);
            int res[] = new int[n - 1];
            res[0] = (arr[0] + arr[1]) / 2;
            if (arr.length > 2) {
                for (int i = 2; i < n; i++) {
                    res[i - 1] = (res[i - 2] + arr[i]) / 2;
                }
            }

            System.out.println(res[res.length - 1]);
            t--;
        }
        sc.close();
    }
}