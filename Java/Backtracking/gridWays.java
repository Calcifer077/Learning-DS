public class gridWays {
    public static int totalGridWays(int i, int j, int n, int m) {
        // What base case means is that if you are already standing at target, there is
        // '1' way not '0' as zero signifies that there is no way to reach the target.
        if (i == n - 1 && j == m - 1) { // Base case
            return 1;
        } else if (i == n || j == m) { // boundary case in case our i or j crosses our boundary
            return 0;
        }

        // go right -> increment column
        int w1 = totalGridWays(i + 1, j, n, m);

        // go down -> increment row
        int w2 = totalGridWays(i, j + 1, n, m);
        return w1 + w2;
    }

    public static void main(String[] args) {
        int n = 3, m = 3;
        System.out.println(totalGridWays(0, 0, n, m));
    }
}