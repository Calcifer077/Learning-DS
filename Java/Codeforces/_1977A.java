import java.util.*;

public class _1977A {
    public static void solve(int a, int b) {
        if (a == b) {
            System.out.println("Yes");
            return;
        } else if (a < b) {
            System.out.println("No");
            return;
        } else {
            int res = Math.abs(a - b);
            if (res % 2 == 0) {
                System.out.println("Yes");
                return;
            } else {
                System.out.println("No");
                return;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            solve(a, b);
            t--;
        }
        sc.close();
    }
}