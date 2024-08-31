import java.util.*;

public class _2002A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();
            System.out.println(Math.min(n, k) * Math.min(m, k));
            t--;
        }
        sc.close();
    }
}