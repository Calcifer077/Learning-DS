package Java.Queues;

import java.util.*;

public class deque {
    public static void main(String[] args) {
        // 'Deque' is a double ended queue in which you can perform insertion and
        // deletion from both ends.
        Deque<Integer> deque = new LinkedList<>();
        deque.addFirst(1);
        deque.addFirst(2);
        deque.addLast(3);
        System.out.println(deque);

        deque.removeFirst();
        System.out.println(deque);

        deque.removeLast();
        System.out.println(deque);

    }
}
