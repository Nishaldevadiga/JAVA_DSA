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
        //lowest common ancestor

        public static Node LCA(Node root, int n1,int n2){
            //find the path
            //creating two arraylist
            ArrayList<Node> path1=new ArrayList<>();
            ArrayList<Node> path2=new ArrayList<>();



            //iterate through the path to find lca
        }

    }

    public static void main(String[] args) {

        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree t = new BinaryTree();
        BinaryTree.idx = -1;
        Node root = t.BuildTree(nodes);
        // System.out.println(root.data);
        int level = 1, k = 3;
        t.printlevel(root, level, k);

    }

}
