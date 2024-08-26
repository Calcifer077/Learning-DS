import java.util.*;

public class _2003A {
    public static void solve(int n, String str) {
        if (n < 2) {
            System.out.println("NO");
            return;
        } else {
            char strChar[] = str.toCharArray();
            if (strChar[0] == strChar[strChar.length - 1]) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t > 0) {
            int n = sc.nextInt();
            String str = sc.next();

            solve(n, str);

            t--;
        }
        sc.close();
    }
}
