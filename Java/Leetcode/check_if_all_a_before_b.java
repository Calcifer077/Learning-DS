public class check_if_all_a_before_b {
    public static boolean checkString(String s) {
        if (s.length() == 1) {
            return true;
        }
        char[] ch = s.toCharArray();

        for (int i = 1; i < ch.length; i++) {
            if (ch[i - 1] == 'b' && ch[i] == 'a') {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "b";
        System.out.println(checkString(s));
    }
}
