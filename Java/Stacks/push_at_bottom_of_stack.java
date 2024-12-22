import java.util.Stack;

public class push_at_bottom_of_stack {

    public static void pushAtBottom(Stack<Integer> s, int data) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }

        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<>();
        s1.push(1);
        s1.push(2);
        s1.push(3);

        // Stack<Integer> s2 = new Stack<>();
        // while (!s1.empty()) {
        // s2.push(s1.peek());
        // s1.pop();
        // }

        // s2.push(4);
        // while (!s2.empty()) {
        // s1.push(s2.peek());
        // s2.pop();
        // }

        pushAtBottom(s1, 4);

        while (!s1.empty()) {
            System.out.println(s1.peek());
            s1.pop();
        }

    }
}
