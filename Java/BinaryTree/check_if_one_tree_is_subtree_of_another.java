package Java.BinaryTree;

public class check_if_one_tree_is_subtree_of_another {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static boolean isIdentical(Node node, Node subRoot) {
        // If both are null that means that they are identical
        if (node == null && subRoot == null) {
            return true;
        }

        // If only one of them is null or the data is different for two nodes then they
        // are not identical
        if (node == null || subRoot == null || node.data != subRoot.data) {
            return false;
        }

        // Check for left subtree.
        // If it returns false, then the answer is also false.
        if (!isIdentical(node.left, subRoot.left)) {
            return false;
        }

        // Check for right subtree.
        // If it returns false, then the answer is also false.
        if (!isIdentical(node.right, subRoot.right)) {
            return false;
        }

        return true;
    }

    public static boolean isSubtree(Node root, Node subRoot) {
        if (root == null) {
            return false;
        }

        if (root.data == subRoot.data) {
            if (isIdentical(root, subRoot)) {
                return true;
            }
        }

        // Check for left and right. Whichever returns true is the answer.
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        Node subRoot = new Node(2);
        subRoot.left = new Node(4);
        subRoot.right = new Node(5);

        System.out.println(isSubtree(root, subRoot));
    }

}
