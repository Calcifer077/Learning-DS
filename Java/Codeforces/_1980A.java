import java.util.*;

public class _1980A {

    public static int solve(int n, int m, String problem) {
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int e = 0;
        int f = 0;
        int g = 0;

        char[] ch = problem.toCharArray();
        for (int i = 0; i < n; i++) {
            switch (ch[i]) {
                case 'A':
                    a++;
                    break;
                case 'B':
                    b++;
                    break;
                case 'C':
                    c++;
                    break;
                case 'D':
                    d++;
                    break;
                case 'E':
                    e++;
                    break;
                case 'F':
                    f++;
                    break;
                case 'G':
                    g++;
                    break;
            }
        }

        int res = 0;
        if (a < m) {
            res += m - a;
        }
        if (b < m) {
            res += m - b;
        }
        if (c < m) {
            res += m - c;
        }
        if (d < m) {
            res += m - d;
        }
        if (e < m) {
            res += m - e;
        }
        if (f < m) {
            res += m - f;
        }
        if (g < m) {
            res += m - g;
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            String problem = sc.next();
            System.out.println(solve(n, m, problem));
            t--;
        }
        sc.close();
    }
}
