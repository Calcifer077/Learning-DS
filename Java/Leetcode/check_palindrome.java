
public class check_palindrome {
    public static boolean isPalindrome(int x) {

        if (x < 0) {
            return false;
        }

        if (x < 10) {
            return true;
        }

        int temp = x;
        int sum = 0;
        while (temp > 0) {
            int a = temp % 10;
            sum = a + sum * 10;
            temp = temp / 10;
        }

        if (sum == x) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int x = 1111111112;
        System.out.println(isPalindrome(x));
    }
}
