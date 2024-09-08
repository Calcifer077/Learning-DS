import java.util.*;

public class _1988B {
    public static void solve(int a, int b) {
        if (a == b && a <= 1) {
            System.out.println("YES");
            return;
        }

        if (a > b) {
            System.out.println("NO");
            return;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int a = sc.nextInt();

            solve(n, a);
            t--;
        }
        sc.close();
    }
}
