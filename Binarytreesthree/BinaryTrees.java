package Binarytreesthree;

import java.util.ArrayList;

public class BinaryTrees {

    static class Node {
        int data;
        Node rightNode;
        Node leftNode;

        Node(int data) {
            this.data = data;
            this.rightNode = null;
            this.leftNode = null;
        }
    }

    static class BinaryTree {

        static int idx = -1;

        public static Node BuildTree(int nodes[]) {
            idx++;

            if (nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.leftNode = BuildTree(nodes);
            newNode.rightNode = BuildTree(nodes);

            return newNode;

        }

        public static void printlevel(Node root, int level, int k) {
            if (root == null) {
                return;
            }
            if (level == k) {
                System.out.print(root.data + " ");
                return;
            }

            printlevel(root.leftNode, level + 1, k);
            printlevel(root.rightNode, level + 1, k);

        }

        public static boolean getPath(Node root, int n, ArrayList<Node> path) {

            if (root == null) {
                return false;
            }
            path.add(root);

            if (root.data == n) {
                return true;
            }

            boolean isleft = getPath(root.leftNode, n, path);
            boolean isright = getPath(root.rightNode, n, path);

            if (isleft || isright) {
                return true;
            }

            path.remove(path.size() - 1);
            return false;

        }
        // lowest common ancestor

        public static Node LCA(Node root, int n1, int n2) {
            // find the path
            // creating two arraylist
            ArrayList<Node> path1 = new ArrayList<>();
            ArrayList<Node> path2 = new ArrayList<>();

            getPath(root, n1, path1);
            getPath(root, n2, path2);

            // iterate through the path to find lca
            int i = 0;
            for (; i < path1.size() && i < path2.size(); i++) {
                if (path1.get(i) != path2.get(i)) {
                    break;
                }
            }

            Node lca = path1.get(i - 1);// last index
            return lca;
        }

        // LCA optimized approach
        public static Node LCA2(Node root, int n1, int n2) {
            if (root == null || root.data == n1 || root.data == n2) {
                return root;
            }

            Node leftLCA = LCA2(root.leftNode, n1, n2);
            Node rightLCA = LCA2(root.rightNode, n1, n2);

            if (leftLCA == null) {
                return rightLCA;
            }
            if (rightLCA == null) {
                return leftLCA;
            }

            return root;
        }

        public static int lcadist(Node root, int n) {

            if (root == null) {
                return -1;
            }
            if (root.data == n) {
                return 0;
            }

            int ledtdist = lcadist(root.leftNode, n);
            int rightdist = lcadist(root.rightNode, n);

            if (ledtdist == -1 && rightdist == -1) {
                return -1;
            } else if (ledtdist == -1) {
                return rightdist + 1;
            } else {
                return ledtdist + 1;
            }

        }

        public static int distance(Node root, int n1, int n2) {

            Node lca = LCA2(root, n1, n2);

            int dist1 = lcadist(lca, n1);
            int dist2 = lcadist(lca, n2);

            return dist1 + dist2;

        }

        public static int distances(Node root, int k, int n) {
            if (root == null) {
                return -1;
            }
            if (root.data == n) {
                return 0;
            }

            int leftdist = distances(root.leftNode, k, n);
            int rightdist = distances(root.rightNode, k, n);

            if (leftdist == -1 && rightdist == -1) {
                return -1;
            }

            int max = Math.max(leftdist, rightdist);
            if (max + 1 == k) {
                System.out.println("node =" + root.data);
            }

            return max + 1;
        }

        public static int Transform(Node root) {
            if (root == null) {
                return 0;
            }

            int leftsum = Transform(root.leftNode);
            int rightsum = Transform(root.rightNode);

            return root.data + leftsum + rightsum;
        }

    }

    public static void main(String[] args) {

        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree t = new BinaryTree();
        BinaryTree.idx = -1;
        Node root = t.BuildTree(nodes);
        // System.out.println(root.data);
        int level = 1, k = 3;
        // t.printlevel(root, level, k);
        // System.out.print(t.LCA(root, 4, 6).data);
        // System.out.print(t.LCA2(root, 4, 6).data);
        // System.out.println(t.distance(root, 4, 6));
        // t.distances(root, 2, 6);
        System.out.println(t.Transform(root));

    }

}
