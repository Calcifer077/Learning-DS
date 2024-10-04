public class doubleLL {
    public class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addInTheBegining(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public int removeFromBegining() {
        if (head == null) {
            return -1;
        }
        if (head.next == null) {
            head = tail = null;
            size--;
            return -1;
        }

        int val = head.data;
        size--;
        head = head.next;
        head.prev = null;
        return val;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public void reverse() {
        Node curr = head;
        Node prev = null;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            curr.prev = next;

            prev = curr;
            curr = next;
        }

        head = prev;

    }

    public static void main(String[] args) {
        doubleLL dll = new doubleLL();
        dll.addInTheBegining(1);
        dll.addInTheBegining(2);
        dll.addInTheBegining(3);

        dll.print();
    }
}
