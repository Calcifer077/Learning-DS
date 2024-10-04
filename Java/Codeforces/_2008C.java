// Longes good array

import java.util.*;

public class _2008C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            long a = sc.nextInt();
            long b = sc.nextInt();

            long x = (long) Math.sqrt((b - a) * 2);
            while (x * (x + 1) / 2 > (b - a)) {
                x--;
            }
            System.out.println(x + 1);
            t--;
        }
        sc.close();
    }
}