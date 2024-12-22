import java.util.*;

public class _2039B {
    public static void solve(String str) {
        if (str.length() < 2) {
            System.out.println(-1);
            return;
        }

        for (int i = 0; i < str.length() - 1; i++) {
            char a = str.charAt(i);
            char b = str.charAt(i + 1);
            if (a == b) {
                System.out.println(a + "" + b);
                return;
            }
        }

        for (int i = 0; i < str.length() - 2; i++) {
            char a = str.charAt(i);
            char b = str.charAt(i + 1);
            char c = str.charAt(i + 2);

            if (a != b && a != c && b != c) {
                System.out.println(a + "" + b + "" + c);
                return;
            }
        }

        System.out.println(-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            String str = sc.next();
            solve(str);
            t--;
        }
        sc.close();
    }
}