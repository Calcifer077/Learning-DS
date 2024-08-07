public class print_factorial_of_a_number {
    public static int printFactorial(int n) {
        if (n == 0) {
            return 1;
        }

        return n * printFactorial(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(printFactorial(5));
    }
}
