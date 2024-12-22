import java.util.Stack;

public class valid_parantheses {

    public static boolean check(String s) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                st.push(s.charAt(i));
            } else {
                if (st.empty()) {
                    return false;
                }

                char top = st.peek();
                if ((s.charAt(i) == ')' && top == '(') || (s.charAt(i) == ']' && top == '[')
                        || (s.charAt(i) == '}' || top == '{')) {
                    st.pop();
                } else {
                    return false;
                }
            }
        }

        if (st.empty()) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        String s = ")";

        System.out.println(check(s));
    }
}
