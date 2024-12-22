class Node {
    int data;
    Node left, right;

    Node(int val) {
        data = val;
        left = null;
        right = null;
    }
}

public class binary_search_tree {
    static Node insert(Node root, int val) {
        Node newNode = new Node(val);
        if (root == null) {
            root = newNode;
            return root;
        }

        if (root.data < val) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }

        return root;
    }

    static Node search(Node root, int val) {
        if (root.data == val) {
            return root;
        }

        if (root.data > val) {
            return search(root.left, val);
        } else {
            return search(root.right, val);
        }
    }

    public static void main(String[] args) {

    }
}
