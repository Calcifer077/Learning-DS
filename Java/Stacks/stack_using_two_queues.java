package Java.Stacks;

import java.util.LinkedList;
import java.util.Queue;

public class stack_using_two_queues {
    static class Stack {
        static Queue<Integer> q1 = new LinkedList<>();
        static Queue<Integer> q2 = new LinkedList<>();

        public static boolean isEmpty() {
            return q1.isEmpty() && q2.isEmpty();
        }

        /*
         * public static void push(int data) {
         * if (!q1.isEmpty()) {
         * q1.add(data);
         * } else {
         * q2.add(data);
         * }
         * }
         * 
         * public static int pop() {
         * if (q1.isEmpty() && q2.isEmpty()) {
         * System.out.println("Empty stack");
         * return -1;
         * }
         * 
         * int top = -1;
         * 
         * if (!q1.isEmpty()) {
         * while (!q1.isEmpty()) {
         * top = q1.remove();
         * 
         * // Here, we are using a break statement because we want the last element as a
         * // output. If we don't break the while loop here it will make that element go
         * // into the other queue which will result in a infinite loop as the element
         * is
         * // never removed.
         * if (q1.isEmpty()) {
         * break;
         * }
         * q2.add(top);
         * }
         * } else {
         * while (!q2.isEmpty()) {
         * top = q2.remove();
         * 
         * if (q2.isEmpty()) {
         * break;
         * }
         * q1.add(top);
         * }
         * }
         * 
         * return top;
         * }
         * 
         * public static int peek() {
         * if (q1.isEmpty() && q2.isEmpty()) {
         * System.out.println("Stack is empty");
         * return -1;
         * }
         * 
         * int top = -1;
         * 
         * if (!q1.isEmpty()) {
         * while (!q1.isEmpty()) {
         * top = q1.remove();
         * q2.add(top);
         * }
         * } else {
         * while (!q2.isEmpty()) {
         * top = q2.remove();
         * q1.add(top);
         * }
         * }
         * 
         * return top;
         * }
         * 
         */

        public static void push(int data) {
            q2.add(data);

            while (!q1.isEmpty()) {
                q2.add(q1.peek());
                q1.remove();
            }

            Queue<Integer> q = q1;
            q1 = q2;
            q2 = q;
        }

        public static void pop() {
            if (q1.isEmpty()) {
                System.out.println("Stack is empty");
                return;
            }
            q1.remove();
        }

        public static int peek() {
            if (q1.isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }

            return q1.peek();
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();

        s.push(1);
        s.push(2);
        s.push(3);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
