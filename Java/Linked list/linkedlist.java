public class linkedlist {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addInTheBegining(int val) {
        Node newNode = new Node(val);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void addInTheEnd(int val) {
        Node newNode = new Node(val);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void addInTheMiddle(int val, int index) {
        Node newNode = new Node(val);
        Node temp = head;
        Node prev = head;

        int i = 1;
        while (i <= index) {
            prev = temp;
            temp = temp.next;
            i++;
        }
        size++;
        prev.next = newNode;
        newNode.next = temp;
    }

    public void deleteFromBegining() {
        if (head == null) {
            return;
        }

        if (head.next == null) {
            head = tail = null;
            size--;
            return;
        }

        head = head.next;
        size--;
    }

    public void deleteFromEnd() {
        if (head == null) {
            return;
        }

        if (head.next == null) {
            head = tail = null;
            size--;
            return;
        }

        Node temp = head;
        Node prev = head;
        while (temp.next != null) {
            prev = temp;
            temp = temp.next;
        }

        prev.next = null;
    }

    public void printLinkedList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    public int searchIterative(int key) {
        if (head == null) {
            return -1;
        }

        Node temp = head;
        int i = 0;
        while (temp != null) {
            i++;
            if (temp.data == key) {
                return i;
            }
            temp = temp.next;
        }
        return -1;
    }

    public int searchRecursive(int key, Node temp) {
        if (temp == null) {
            return -1;
        }

        if (temp.data == key) {
            return 1;
        }

        return searchRecursive(key, temp.next) + 1;
    }

    public void reverseLinkedlist() {
        if (head == null) {
            return;
        }

        if (head.next == null) {
            return;
        }

        Node prev = null;
        Node curr = head;
        Node front;
        while (curr != null) {
            front = curr.next;
            curr.next = prev;
            prev = curr;
            curr = front;
        }

        head = prev;
    }

    public Node findMid() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.addInTheBegining(1);
        ll.addInTheEnd(2);
        ll.addInTheEnd(3);
        ll.addInTheEnd(4);
        ll.addInTheEnd(5);
        ll.printLinkedList();

        // ll.deleteFromBegining();
        // ll.deleteFromEnd();

        // ll.addInTheMiddle(20, 2);

        // System.out.println(ll.searchRecursive(3, linkedlist.head));
        // ll.reverseLinkedlist();

        ll.printLinkedList();
    }
}
