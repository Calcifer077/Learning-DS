import java.util.*;

public class avl_tree {
    public static class Node {
        int data;
        Node left;
        Node right;
        int height;

        Node(int val) {
            data = val;
            left = null;
            right = null;
            height = 1;
        }
    }

    public static int height(Node n) {
        if (n == null) {
            return 0;
        }
        return n.height;
    }

    public static Node rightRotate(Node root) {
        Node leftNode = root.left;
        Node leftRightNode = root.right;

        leftNode.right = root;
        root.left = leftRightNode;

        root.height = 1 + Math.max(height(root.left), height(root.right));
        leftNode.height = 1 + Math.max(height(leftNode.left), height(leftNode.right));

        return leftNode;
    }

    public static Node leftRotate(Node root) {
        Node rightNode = root.right;
        Node rightLeftNode = rightNode.left;

        rightNode.left = root;
        root.right = rightLeftNode;

        root.height = 1 + Math.max(height(root.left), height(root.right));
        rightNode.height = 1 + Math.max(height(rightNode.left), height(rightNode.right));

        return rightNode;
    }

    public static int getBalance(Node n) {
        if (n == null) {
            return 0;
        }

        return height(n.left) - height(n.right);
    }

    public static Node insert(Node node, int key) {
        if (node == null) {
            Node newNode = new Node(key);
            return newNode;
        }

        if (node.data < key) {
            node.left = insert(node.right, key);
        } else if (node.data > key) {
            node.right = insert(node.left, key);
        } else {
            return node;
        }

        node.height = 1 + Math.max(height(node.left), height(node.right));

        int balance = getBalance(node);

        if (balance > 1 && key < node.left.data) {
            return rightRotate(node);
        }

        if (balance < -1 && key > node.right.data) {
            return leftRotate(node);
        }

        if (balance > 1 && key > node.left.data) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        if (balance < -1 && key < node.right.data) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }

    public static void preOrder(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    public static void main(String[] args) {
        Node root = null;

        // Constructing tree given in the above figure
        root = insert(root, 10);
        root = insert(root, 20);
        root = insert(root, 30);
        root = insert(root, 40);
        root = insert(root, 50);
        root = insert(root, 25);

        System.out.println("Preorder traversal : ");
        preOrder(root);
    }
}
