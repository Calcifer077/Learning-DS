package Java.Queues;

import java.util.*;

public class interleave_two_halves_of_a_queue {
    // public static void interleave(Queue<Integer> q) {
    // int size = q.size();

    // Queue<Integer> first = new LinkedList<>();

    // int i = 0;
    // while (i < size / 2) {
    // first.add(q.peek());
    // q.remove();
    // i++;
    // }

    // Queue<Integer> result = new LinkedList<>();

    // i = 0;
    // while (i < size / 2) {
    // result.add(first.peek());
    // first.remove();
    // result.add(q.peek());
    // q.remove();
    // i++;
    // }

    // while (!result.isEmpty()) {
    // System.out.println(result.peek());
    // result.remove();
    // }
    // }

    public static void interleave(Queue<Integer> q) {
        int size = q.size();

        Queue<Integer> first = new LinkedList<>();

        int i = 0;
        while (i < size / 2) {
            first.add(q.peek());
            q.remove();
            i++;
        }

        while (!first.isEmpty()) {
            q.add(first.peek());
            first.remove();
            q.add(q.peek());
            q.remove();
        }

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);

        interleave(q);
    }
}
