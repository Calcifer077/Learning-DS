public class print_binary_strings {
    public static void binaryStrings(int n, int lastPlace, String str) {
        // if (lastPlace == 0) {
        // binaryStrings(n - 1, 0, str.append("0"));
        // binaryStrings(n - 1, 1, str.append("1"));
        // } else {
        // binaryStrings(n - 1, 0, str.append("0"));
        // }

        // Base case
        if (n == 0) {
            System.out.println(str);
            return;
        }

        binaryStrings(n - 1, 0, str + "0");
        if (lastPlace == 0) {
            binaryStrings(n - 1, 1, str + "1");
        }
    }

    public static void main(String[] args) {
        binaryStrings(3, 0, "");
    }
}
