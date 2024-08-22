// Creating words

import java.util.*;

public class _1985A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t > 0) {
            String a = sc.next();
            String b = sc.next();

            // Converting above strings to characters so that we can swap them.
            char c[] = a.toCharArray();
            char d[] = b.toCharArray();

            char temp = c[0];
            c[0] = d[0];
            d[0] = temp;

            System.out.print(c);
            System.out.print(" ");
            System.out.print(d);
            System.out.println();
            t--;
        }
        sc.close();
    }
}
