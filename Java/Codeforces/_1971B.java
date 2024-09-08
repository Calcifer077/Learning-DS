// Different string

import java.util.*;

public class _1971B {

    public static void solve(String s) {
        char ch[] = s.toCharArray();

        if (ch.length == 1) {
            System.out.println("NO");
            return;
        } else {
            Boolean notSame = false;
            for (int i = 0; i < ch.length - 1; i++) {
                if (ch[i] != ch[i + 1]) {
                    char temp = ch[i];
                    ch[i] = ch[i + 1];
                    ch[i + 1] = temp;
                    notSame = true;
                    break;
                }
            }
            if (notSame == false) {
                System.out.println("NO");
                return;
            } else {
                System.out.println("YES");
                System.out.println(String.valueOf(ch));
                return;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            String s = sc.next();
            solve(s);
            t--;
        }
        sc.close();
    }
}
