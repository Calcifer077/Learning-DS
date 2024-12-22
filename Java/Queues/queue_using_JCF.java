package Java.Queues;

import java.util.ArrayDeque;
// import java.util.LinkedList;
import java.util.Queue;

public class queue_using_JCF {
    public static void main(String[] args) {
        // 'Queue' is a interface not a class.
        // That's why you have to use other classes to implement it.
        // You can use either 'LinkedList' or 'ArrayDeque' to impelement it.
        // Queue<Integer> q = new LinkedList<>();
        Queue<Integer> q = new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
