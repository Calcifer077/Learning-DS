package Java.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class contruct_tree_from_preorder {
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

    static class BinaryTree {
        static int idx = -1;

        public static Node buildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }

        public static void preorder(Node root) {
            if (root == null) {
                return;
            }

            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }

        public static void inorder(Node root) {
            if (root == null) {
                return;
            }

            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }

        public static void postorder(Node root) {
            if (root == null) {
                return;
            }

            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }

        // Level order traversal
        public static void levelOrder(Node root) {
            if (root == null) {
                return;
            }

            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while (!q.isEmpty()) {
                Node currNode = q.remove();
                if (currNode == null) {
                    System.out.println();
                    if (q.isEmpty()) {
                        break;
                    } else {
                        q.add(null);
                    }
                } else {
                    System.out.print(currNode.data + " ");

                    if (currNode.left != null) {
                        q.add(currNode.left);
                    }
                    if (currNode.right != null) {
                        q.add(currNode.right);
                    }
                }

            }
        }

        public static int heightOfATree(Node root) {
            if (root == null) {
                return 0;
            }

            // height of a tree is the maximum number of nodes from root to the deepest
            // edge.

            // That's why we are taking 'Math.max'
            // +1 denotes count the current node
            return Math.max(heightOfATree(root.left), heightOfATree(root.right)) + 1;
        }

        public static int countNumberOfNodes(Node root) {
            if (root == null) {
                return 0;
            }

            return countNumberOfNodes(root.left) + countNumberOfNodes(root.right) + 1;
        }

        public static int sumOfNodes(Node root) {
            if (root == null) {
                return 0;
            }

            // Firstly calculate sum of left subtree, then sum of right subtree
            // Then add data at current node.
            return (sumOfNodes(root.left) + sumOfNodes(root.right)) + root.data;
        }

        // O(n ^ 2)
        // O(n) for calculating diameter for each node
        // We are also calculating height for each node which will take O(n) time for
        // each node
        /*
         * 
         * public static int diameter(Node root) {
         * if (root == null) {
         * return 0;
         * }
         * 
         * // There are two possible cases for a diameter of a tree.
         * // 1. Diameter passes through root
         * // 2. Diameter doesn't pass through root
         * 
         * // If a diameter passes through root then we need height of that particular
         * node
         * 
         * // If a diameter doesn't pass through root then we need diameter of left
         * subtree
         * // and diameter of right subtree and we will take the maximum of it.
         * 
         * // Calculate diameter for left subtree
         * int leftDiam = diameter(root.left);
         * 
         * // Calculate diameter for right subtree
         * int rightDiam = diameter(root.right);
         * 
         * // Calculate left and right height for calculating height of a tree.
         * int leftHt = heightOfATree(root.left);
         * int rightHt = heightOfATree(root.right);
         * 
         * int selfDiam = leftHt + rightHt + 1;
         * 
         * return Math.max(selfDiam, Math.max(leftDiam, rightDiam));
         * }
         * 
         */

        static class Info {
            int diam;
            int ht;

            public Info(int diam, int ht) {
                this.diam = diam;
                this.ht = ht;
            }
        }

        public static Info diameter(Node root) {
            if (root == null) {
                return new Info(0, 0);
            }

            Info leftInfo = diameter(root.left);
            Info rightInfo = diameter(root.right);

            int diam = Math.max(leftInfo.diam, Math.max(rightInfo.diam, leftInfo.ht + rightInfo.ht + 1));

            int ht = Math.max(leftInfo.ht, rightInfo.ht) + 1;

            return new Info(diam, ht);
        }
    }

    public static void main(String[] args) {
        // int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };

        // BinaryTree tree = new BinaryTree();
        // Node root = BinaryTree.buildTree(nodes);
        // System.out.println(root.data);
        // BinaryTree.preorder(root);
        // BinaryTree.inorder(root);
        // BinaryTree.postorder(root);
        // BinaryTree.levelOrder(root);
        // System.out.println(BinaryTree.heightOfATree(root));

        // System.out.println(BinaryTree.countNumberOfNodes(root));

        // System.out.println(BinaryTree.sumOfNodes(root));

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        // System.out.println(BinaryTree.diameter(root));
        System.out.println(BinaryTree.diameter(root).diam);

    }
}
