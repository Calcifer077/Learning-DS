// Not quite latin square

import java.util.*;

public class _1915B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            String[] str = new String[3];
            for (int i = 0; i < 3; i++) {
                str[i] = sc.next();
            }

            int idx = 0;
            for (int i = 0; i < 3; i++) {
                char[] ch = str[i].toCharArray();
                for (int j = 0; j < 3; j++) {
                    if (ch[j] == '?') {
                        idx = i;
                        break;
                    }
                }
            }

            int a = 0;
            int b = 0;
            int c = 0;
            char[] ch = str[idx].toCharArray();
            for (int i = 0; i < 3; i++) {
                if (ch[i] == 'A') {
                    a++;
                } else if (ch[i] == 'B') {
                    b++;
                } else if (ch[i] == 'C') {
                    c++;
                }
            }

            if (a == 0) {
                System.out.println('A');
            } else if (b == 0) {
                System.out.println('B');
            } else if (c == 0) {
                System.out.println("C");
            }
            t--;
        }
        sc.close();
    }
}
