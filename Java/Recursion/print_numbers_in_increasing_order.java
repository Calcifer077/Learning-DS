public class print_numbers_in_increasing_order {

    public static void printNumbersInIncreasingOrder(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        printNumbersInIncreasingOrder(n - 1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        printNumbersInIncreasingOrder(10);
    }
}
