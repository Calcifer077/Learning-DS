// Catch the coin

import java.util.*;

public class _1989A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            // If 'y' is less than -1 we can't catch it any case because as we move it will
            // fall by one step. So there will always be a distance of 1.
            // In any condition we can catch it by just moving in that direction.
            if (y >= -1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            t--;
        }

        sc.close();
    }
}
