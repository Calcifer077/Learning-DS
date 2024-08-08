public class print_x_to_power_n {

    public static int printpower(int x, int n) {
        if (n < 0) {
            return -1;
        }
        if (n == 0) {
            return 1;
        }
        return x * printpower(x, n - 1);

    }

    // public static int printpowerOptimized(int x, int n) {
    // if (n < 0) {
    // return -1;
    // }

    // if (n == 0) {
    // return 1;
    // }

    // if (n % 2 == 0) {
    // return printpower(x, n / 2) * printpower(x, n / 2);
    // }
    // // return x * printpower(x, n/2) * printpower(x, n/2);
    // return x * printpower(x, (n - 1));
    // }

    public static int printpowerOptimized(int a, int n) {
        if (n == 0) {
            return 1;
        }
        int halfPower = printpowerOptimized(a, n / 2);
        int halfPowerSq = halfPower * halfPower;

        if (n % 2 != 0) {
            halfPowerSq = a * halfPowerSq;
        }

        return halfPowerSq;
    }

    public static void main(String[] args) {
        System.out.println(printpower(2, 10));
    }
}
