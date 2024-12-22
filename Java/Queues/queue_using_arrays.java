package Java.Queues;

public class queue_using_arrays {
    static class Queue {
        static int arr[];
        static int size;
        static int rear;

        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
        }

        public static boolean isEmpty() {
            return rear == -1;
        }

        public static void add(int data) {
            if (rear == size - 1) {
                System.out.println("Queue is full");
                return;
            }

            // As the rear starts from -1. We will first increment it to a index that can be
            // used. Firstly increment to 0 then 1 and so on..
            rear = rear + 1;
            // Adding data at that index.
            arr[rear] = data;
        }

        // O(n)
        public static int remove() {
            if (isEmpty()) {
                System.out.println("Empty queue");
                return -1;
            }

            int front = arr[0];
            // Moving elements to the left so we can remove first element.
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            // Chaning rear.
            rear--;
            return front;
        }

        public static int peek() {
            if (isEmpty()) {
                System.out.println("Empty queue");
                return -1;
            }

            return arr[0];
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
