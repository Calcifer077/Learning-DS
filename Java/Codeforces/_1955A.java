// Yogurt sale

import java.util.*;

public class _1955A {

    public static int calcMinPrice(int n, int priceOfOne, int priceOfTwo) {
        if (2 * priceOfOne < priceOfTwo) {
            return n * priceOfOne;
        } else {
            if (n % 2 == 0) {
                return n / 2 * priceOfTwo;
            } else {
                return (n - 1) / 2 * priceOfTwo + priceOfOne;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t > 0) {
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(calcMinPrice(n, a, b));
            t--;
        }
        sc.close();
    }
}