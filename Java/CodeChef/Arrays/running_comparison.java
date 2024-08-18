import java.util.*;

public class running_comparison {
    public static int whoIsHappy(int alice[], int bob[]) {
        int res = 0;

        for (int i = 0; i < alice.length; i++) {
            if (2 * alice[i] < bob[i]) {
                continue;
            } else if (2 * bob[i] < alice[i]) {
                continue;
            } else {
                res++;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int a[] = new int[n];
            int b[] = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                b[i] = sc.nextInt();
            }

            System.out.println(whoIsHappy(a, b));
            t--;
        }

        sc.close();
    }
}
