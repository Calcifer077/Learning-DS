public class print_fibonacci_numbers {
    public static int printFibb(int n) {
        if (n == 0) {
            return n;
        }
        if (n == 1) {
            return n;
        }

        return printFibb(n - 1) + printFibb(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(printFibb(25));
    }
}
