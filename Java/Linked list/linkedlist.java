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

    public void addInTheBegining(int data) {
        // 1. Create a new node with the data that was passed in the argument
        Node newNode = new Node(data);
        size++;

        // Check if 'head' is null, meaning that there are no nodes present in the
        // linked list.
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // 2. Reference the 'next' of this node to 'head'.
        newNode.next = head;

        // 3. Assign 'head' variable to 'newNode'
        head = newNode;
    }

    public void addInTheEnd(int data) {
        // 1. Create a new node with the data provided in the argument
        Node newNode = new Node(data);
        size++;
        // Check if 'head' is equal to null, meaning linked list is empty
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // 2. Reference 'tail''s next to 'newNode'
        tail.next = newNode;

        // 3. Change the value of 'tail' variable to 'newNode'
        tail = newNode;
    }

    public void printLinkedList() {
        if (head == null) {
            System.out.println("Linked list is empty");
            return;
        }

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public void addInTheMiddle(int index, int data) {

        if (index == 0) {
            addInTheBegining(data);
            return;
        }

        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        while (i < index - 1) {
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFromBegining() {
        if (head == null) {
            System.out.println("Linked list is empty");
            return -1;
        } else if (head.next == null) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeFromEnd() {
        // If the linked list is empty
        if (head == null) {
            System.out.println("Linked list is empty");
            return -1;
            // If there is only one element in the linked list
        } else if (head.next == null) {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }

        // Go to last second node and change its next pointer to null
        // Change tail to point to this node
        Node prev = head;
        // prev : size - 2
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }
        // while (prev.next.next != null) {
        // prev = prev.next;
        // }

        int val = tail.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    public int searchIterative(int key) {
        if (head == null) {
            System.out.println("List is empty");
            return -1;
        }

        Node temp = head;
        for (int i = 0; i < size; i++) {
            if (temp.data == key) {
                return i;
            }
            temp = temp.next;
        }

        return -1;
    }

    public int searchRecursive(Node temp, int key, int i) {
        if (temp == null) {
            return -1;
        }

        if (temp.data == key) {
            return i;
        }

        return searchRecursive(temp.next, key, i + 1);
    }

    public int searchRecursiveWithoutIdx(Node temp, int key) {
        if (temp == null) {
            return -1;
        }

        if (temp.data == key) {
            return 0;
        }

        return searchRecursiveWithoutIdx(temp.next, key) + 1;
    }

    public void reverseLinkedList() {
        if (head == null || head.next == null) {
            return;
        }

        // Node temp = head;
        Node curr = head;
        Node back = null;
        Node front = head;

        while (curr != null) {
            front = curr.next;
            curr.next = back;
            back = curr;
            curr = front;
            // temp = temp.next;
        }

        head = back;
    }

    public void removeNthNodeFromEnd(int n) {
        if (n == size) {
            head = head.next;
            return;
        }
        Node front = head;

        n = size - n;
        int i = 1;
        while (i < n) {
            front = front.next;
            i++;
        }

        front.next = front.next.next;
    }

    // Slow and fast pointer approach
    public Node findMid(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public boolean checkIfLinkedListPalindrome() {
        if (head == null || head.next == null) {
            return true;
        }

        Node midNode = findMid(head);

        Node prev = null;
        Node curr = midNode;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev;
        Node left = head;

        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }

        return true;
    }

    public static boolean isCycle() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public static void removeCycle() {
        // Detect cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                cycle = true;
                break;
            }
        }

        if (cycle == false) {
            return;
        }
        // Find meeting point
        slow = head;
        Node prev = null;
        while (slow != fast) {
            slow = slow.next;
            prev = fast;
            fast = fast.next;
        }

        // Remove cycle
        prev.next = null;
    }

    public Node getMidForSorting(Node head) {
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public Node merge(Node head1, Node head2) {
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }

        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }

        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }

        return mergedLL.next;
    }

    public Node mergeSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        // Find mid
        Node mid = getMidForSorting(head);

        // left & right half
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        // merge
        return merge(newLeft, newRight);
    }

    public Node findLast(Node head) {
        Node temp = head;
        Node prev = head;

        while (temp.next != null) {
            prev = temp;
            temp = temp.next;
        }
        prev = null;

        return temp;
    }

    public void zigZagLinkedList(Node head) {
        // find middle
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node mid = slow;

        // reverse 2nd half
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node left = head;
        Node right = prev;
        Node nextL, nextR;

        while (left != null && right != null) {
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;

            left = nextL;
            right = nextR;
        }

    }

    public static void main(String[] args) {
        // linkedlist list = new linkedlist();
        // list.addInTheBegining(1);
        // list.addInTheBegining(2);
        // list.addInTheEnd(3);
        // list.addInTheEnd(4);
        // list.addInTheMiddle(2, 21);
        // list.printLinkedList();

        // System.out.println(linkedlist.size);

        // list.removeFromBegining();
        // list.printLinkedList();

        // list.removeFromEnd();
        // list.printLinkedList();

        // System.out.println(list.searchIterative(48));
        // System.out.println(list.searchRecursive(linkedlist.head, 21, 0));

        // System.out.println(list.searchRecursiveWithoutIdx(list.head, 21));

        // list.reverseLinkedList();
        // list.removeNthNodeFromEnd(2);
        // list.printLinkedList();

        // list.addInTheEnd(1);
        // list.addInTheEnd(2);
        // list.addInTheEnd(1);

        // list.printLinkedList();
        // System.out.println(list.checkIfLinkedListPalindrome());

        // head = new Node(1);
        // head.next = new Node(2);
        // head.next.next = new Node(3);
        // head.next.next.next = head;

        // removeCycle();

        // linkedlist ll = new linkedlist();
        // ll.addInTheBegining(1);
        // ll.addInTheBegining(2);
        // ll.addInTheBegining(3);
        // ll.addInTheBegining(4);
        // ll.addInTheBegining(5);

        // ll.printLinkedList();
        // linkedlist.head = ll.mergeSort(linkedlist.head);
        // ll.printLinkedList();

        linkedlist ll = new linkedlist();
        ll.addInTheEnd(1);
        ll.addInTheEnd(2);
        ll.addInTheEnd(3);
        ll.addInTheEnd(4);
        ll.addInTheEnd(5);

        ll.printLinkedList();

        ll.zigZagLinkedList(head);

        ll.printLinkedList();
    }
}
