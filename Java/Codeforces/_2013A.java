import java.util.*;

public class _2013A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();

            int res = Math.min(x, y);

            int count = n / res;

            if (n % res != 0) {
                count++;
            }

            System.out.println(count);
            t--;
        }
        sc.close();
    }
}