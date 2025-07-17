package BST;

import java.util.ArrayList;

public class BST {

    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // Building a Binary search tree
    public static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }

        if (root.data > val) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static boolean search(Node root, int key) {

        if (root == null) {
            return false;
        }

        if (root.data == key) {
            return true;
        }

        if (root.data > key) {
            return search(root.left, key);
        } else {
            return search(root.right, key);
        }
    }

    public static void inorder(Node root) {

        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static Node delete(Node root, int val) {
        if (root.data > val) {
            root.left = delete(root.left, val);
        } else if (root.data < val) {
            root.right = delete(root.right, val);
        } else {
            // root==vall
            // case 1: no child
            if (root.right == null && root.left == null) {
                return null;
            }

            // case 2: single child
            if (root.right == null) {
                return root.left;
            }

            if (root.left == null) {
                return root.right;
            }

            // case 3: two child
            Node IS = inorderIS(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);

        }
        return root;
    }

    public static Node inorderIS(Node root) {
        while (root.left != null) {
            root = root.left;
        }

        return root;
    }

    public static void printinrange(Node root, int v1, int v2) {
        if (root == null) {
            return;
        }

        if (root.data >= v1 && root.data <= v2) {
            printinrange(root.left, v1, v2);
            System.out.println(root.data + " ");
            printinrange(root.right, v1, v2);
        } else if (root.data < v1) {
            printinrange(root.right, v1, v2);
        } else {
            printinrange(root.left, v1, v2);
        }
    }

    public static void printpath(ArrayList<Integer> Path) {
        for (int i = 0; i < Path.size(); i++) {
            System.out.print(Path.get(i) + " ");
        }
        System.out.println();
    }

    public static void roottoleaf(Node root, ArrayList<Integer> path) {

        if (root == null) {
            return;
        }
        path.add(root.data);
        if (root.right == null && root.left == null) {
            printpath(path);
        } else {
            roottoleaf(root.left, path);
            roottoleaf(root.right, path);
        }
        path.remove(path.size() - 1);

    }
    public static boolean isValid(Node root,Node min, Node max){
        if(root==null){
            return true;
        }

        if(min!=null && root.data<=min.data){
            return false;
        }
        if(max!=null && root.data>=max.data){
            return false;
        }

        return isValid(root.left, min, root) &&
        isValid(root.right, root, max);
    }

    public static Node mirror(Node root){
        if(root==null){
            return null;
        }
        Node leftmr=mirror(root.left);
        Node rightmr=mirror(root.right);
        root.left=rightmr;
        root.right=leftmr;
        return root;
    }

    public static void main(String[] args) {
        int val[] = { 5, 1, 3, 4, 2, 7 };
        Node root = null;
        for (int i = 0; i < val.length; i++) {
            root = insert(root, val[i]);
        }
        // inorder(root);

        // boolean result = search(root, 9);
        // if (result == true) {
        // System.out.println("Found");
        // } else {
        // System.out.println("Not found");
        // }

        // delete(root, 2);

        // System.out.println();

        // inorder(root);

        // printinrange(root, 1, 4);
       // roottoleaf(root, new ArrayList<Integer>());
      // System.out.println(isValid(root, null, null));


    }

}
