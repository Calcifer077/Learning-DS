public class print_numbers_in_decreasing_order {

    public static void printNumbersInDecreasingOrder(int n) {
        if (n == 1) {
            System.out.println(1);
            return;
        }

        System.out.println(n + " ");
        printNumbersInDecreasingOrder(n - 1);
    }

    public static void main(String[] args) {
        printNumbersInDecreasingOrder(10);
    }
}
