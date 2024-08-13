public class friends_pairing_problem {
    public static int friendsPair(int n) {
        // Base case
        if (n == 1 || n == 2) {
            return n;
        }

        // choice
        // single
        int single = friendsPair(n - 1);

        // pair
        int pair = (n - 1) * friendsPair(n - 2);

        return single + pair;
    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println(friendsPair(n));
    }
}
