import java.util.Stack;

public class duplicate_parantheses {

    public static boolean isDuplicate(String str) {
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == ')') {
                int count = 0;

                // Here, we are not checking if stack is empty because we know that can't be the
                // case as we are given valid parantheses.
                while (s.peek() != '(') {
                    count++;
                    s.pop();
                }

                if (count == 0) {
                    return true;
                } else {
                    s.pop();
                }
            } else {
                s.push(ch);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String str = "(a+b)";
        System.out.println(isDuplicate(str));
    }
}
