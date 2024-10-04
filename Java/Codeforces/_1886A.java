import java.util.*;

public class _1886A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            long n = sc.nextLong();

            if (n % 3 != 0 && n > 6) {
                System.out.println("YES");
                System.out.println(n - 3 + " 2 " + "1");
            } else if (n % 3 == 0 && n > 9) {
                System.out.println("YES");
                System.out.println(n - 5 + " 4 " + "1");
            } else {
                System.out.println("NO");
            }
            t--;
        }
        sc.close();
    }
}