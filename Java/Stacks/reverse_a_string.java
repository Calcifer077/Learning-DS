import java.util.Stack;

public class reverse_a_string {
    public static void main(String[] args) {
        Stack<Character> s = new Stack<>();
        String str = "abcde";
        for (int i = 0; i < str.length(); i++) {
            s.push(str.charAt(i));
        }

        StringBuilder res = new StringBuilder("");

        while (!s.empty()) {
            res.append(s.pop());
        }

        System.out.println(res);
    }
}
