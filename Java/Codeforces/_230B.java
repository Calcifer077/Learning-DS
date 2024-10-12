
// T-primes
import java.util.*;

public class _230B {
    // This is the square root of 10^12 which is the contraint in the question.
    static int N = 1000007;

    static boolean prime[] = new boolean[N];

    public static void solve() {
        prime[0] = prime[1] = true;
        for (int i = 2; i * i <= N; i++) {
            if (prime[i] == false) {
                for (int j = i * i; j < N; j += i) {
                    prime[j] = true;
                }

            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        solve();
        for (int i = 0; i < n; i++) {
            long x = sc.nextLong();
            if (x == 1) {
                System.out.println("NO");
                continue;
            }

            // As 'Math.sqrt' returns double we will convert the result to long.
            // 'Math.sqrt' only accepts double so we convert 'x' integer to double
            long y = (long) Math.sqrt((double) x);

            // 'prime' array have values for integer and y is long, so we will convert it to
            // int.
            if (y * y == x && prime[(int) y] == false) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }
        sc.close();
    }
}
