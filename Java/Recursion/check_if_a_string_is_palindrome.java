public class check_if_a_string_is_palindrome {
    public static boolean solve(String s, int i) {
        if (i >= s.length() / 2)
            return true;

        if (s.charAt(i) != s.charAt(s.length() - i - 1))
            return false;

        return solve(s, i + 1);
    }

    public static void main(String[] args) {
        String s = "abcdefdcba";

        System.out.println(solve(s, 0));
    }
}
