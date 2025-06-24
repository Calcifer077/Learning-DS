public class print_1_to_N_using_backtracking {
    public static void solve(int i, int n) {
        if (i < 1) {
            return;
        }

        solve(i - 1, n);
        System.out.println(i);
    }

    public static void main(String[] args) {
        int n = 5;

        solve(n, n);
    }
}
