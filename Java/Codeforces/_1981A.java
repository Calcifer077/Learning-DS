// Turtle and piggy are playing a game

import java.util.*;

public class _1981A {
    public static int solve(int x, int y) {
        double res = 0;
        double count = 0;

        while (true) {
            count++;
            res = Math.pow(2, count);
            if (res > y) {
                return (int) count - 1;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            System.out.println(solve(x, y));

            t--;
        }
        sc.close();
    }
}
