import java.util.Scanner;

public class _1915D {
    public static void solve(String str) {
        StringBuilder res = new StringBuilder();
        int i = str.length() - 1;

        while (i >= 0) {
            int x;
            char lastChar = str.charAt(i);

            if (lastChar == 'a' || lastChar == 'e') {
                x = 2;
            } else {
                x = 3;
            }

            while (x > 0 && i >= 0) {
                res.append(str.charAt(i));
                i--;
                x--;
            }
            res.append(".");
        }

        res.setLength(res.length() - 1);
        res.reverse();
        System.out.println(res);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            int n = sc.nextInt();
            sc.nextLine();
            String str = sc.nextLine();
            solve(str);
        }
        sc.close();
    }
}
