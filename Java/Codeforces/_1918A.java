// Brick wall

import java.util.*;

public class _1918A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            System.out.println(n * (m / 2));

            t--;
        }
        sc.close();
    }
}
