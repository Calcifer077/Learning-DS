import java.util.*;

public class _1915D {
    public static String solve(String str) {
        String res = "";

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e') {
            }

        }

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            String str = sc.next();

            System.out.println(solve(str));
            t--;
        }
        sc.close();
    }
}