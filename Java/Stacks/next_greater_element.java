import java.util.Stack;

public class next_greater_element {
    public static void main(String[] args) {
        int arr[] = { 6, 8, 0, 1, 3 };
        int res[] = new int[arr.length];
        // for (int i = 0; i < arr.length; i++) {
        // for (int j = i + 1; j < arr.length; j++) {
        // if (arr[j] > arr[i]) {
        // res[i] = arr[j];
        // break;
        // }
        // }
        // if (res[i] == 0) {
        // res[i] = -1;
        // }
        // }

        Stack<Integer> s = new Stack<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!s.empty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }

            if (s.empty()) {
                res[i] = -1;
            } else {
                res[i] = arr[s.peek()];
            }

            s.push(i);
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(res[i]);
        }
    }
}
