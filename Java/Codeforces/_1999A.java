// A + B again

import java.util.*;

class _1999A {
    public static int sumOfNum(int n) {
        int first = n % 10;
        n = n / 10;

        return first + n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int num = sc.nextInt();
            System.out.println(sumOfNum(num));
            t--;
        }

        sc.close();
    }
}