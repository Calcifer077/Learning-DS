import java.util.*;

public class _2009A {
    public static int solve(int a, int b) {
        int c = b - a;
        return (c - a) + (b - c);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.println(solve(a, b));
            t--;
        }
        sc.close();
    }
}