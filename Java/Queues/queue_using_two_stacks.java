package Java.Queues;

import java.util.*;

public class queue_using_two_stacks {
    static class Queue {
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public static boolean isEmpty() {
            return s1.empty();
        }

        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }

            return s1.peek();
        }

        // Push O(n), pop O(1)
        // public static void add(int val) {
        // while (!s1.empty()) {
        // s2.push(s1.pop());
        // }

        // s1.push(val);

        // while (!s2.empty()) {
        // s1.push(s2.pop());
        // }
        // }

        // public static int remove() {
        // if (isEmpty()) {
        // System.out.println("Queue is empty");
        // return -1;
        // }
        // return s1.pop();
        // }

        // push O(1), pop O(n)
        public static void add(int val) {
            s1.push(val);
        }

        public static int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            while (!s1.empty()) {
                s2.push(s1.pop());
            }

            int top = s2.pop();

            while (!s2.empty()) {
                s1.push(s2.pop());
            }

            return top;
        }

    }

    public static void main(String[] args) {
        Queue q = new Queue();

        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()) {
            // System.out.println(q.peek());
            System.out.println(q.remove());
        }
    }
}