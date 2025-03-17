package Java.BinaryTree;

import java.util.ArrayList;

public class minimum_distance_between_two_nodes {
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

    public static boolean getPath(Node root, int n, ArrayList<Node> path) {
        // Base case, it will be applied when we reach leaf node or the given root is
        // null.
        if (root == null) {
            return false;
        }

        // Supposing that the current node will contribute to the result.
        path.add(root);

        // We have found the node we were looking for, so return true.
        if (root.data == n) {
            return true;
        }

        // Search in left.
        boolean foundLeft = getPath(root.left, n, path);
        // Search in right.
        boolean foundRight = getPath(root.right, n, path);

        // If the target node is found in any subtree then return true.
        if (foundLeft || foundRight) {
            return true;
        }

        // Target node was not found anywhere, so remove the node which we supposed will
        // contribute to the result.
        path.remove(path.size() - 1);

        // We didn't found the target.
        return false;
    }

    public static Node lca(Node root, int n1, int n2) {
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();

        getPath(root, n1, path1);
        getPath(root, n2, path2);

        int i = 0;
        for (i = 0; i < path1.size() && i < path2.size(); i++) {
            // 'i' will point to the next of lca
            if (path1.get(i) != path2.get(i)) {
                break;
            }
        }

        // returning 'lca'
        return path1.get(i - 1);
    }

    public static Node lca2(Node root, int n1, int n2) {
        if (root == null) {
            return null;
        }

        if (root.data == n1 || root.data == n2) {
            return root;
        }

        Node left = lca2(root.left, n1, n2);
        Node right = lca2(root.right, n1, n2);

        if (right == null) {
            return left;
        }

        if (left == null) {
            return right;
        }

        return root;
    }

    // To find distance from lca
    public static int lcaDist(Node root, int n) {
        // Base case
        if (root == null) {
            return -1;
        }

        // If we found the one we were looking for
        if (root.data == n) {
            return 0;
        }

        // Search in left subtree
        int leftDist = lcaDist(root.left, n);
        // Search in right subtree
        int rightDist = lcaDist(root.right, n);

        // If both returned '-1' meaning that we couldn't find the target anywhere.
        if (leftDist == -1 && rightDist == -1) {
            return -1;
        }

        // If any single one of them returned '-1' then return its counterpart
        if (leftDist == -1) {
            return rightDist + 1;
        } else {
            return leftDist + 1;
        }
    }

    // the best approach for this question is to find distance of two nodes from
    // lca.
    public static int minDist(Node root, int n1, int n2) {
        // Find lca
        Node lca = lca2(root, n1, n2);

        // Find distance between lca and 'n1'.
        int dist1 = lcaDist(lca, n1);
        // Find distance between lca and 'n2'.
        int dist2 = lcaDist(lca, n2);

        // return the sum of two distances
        return dist1 + dist2;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        int n1 = 4, n2 = 6;
        System.out.println(minDist(root, n1, n2));
    }
}
