package BST;

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

    public static void main(String[] args) {
        int val[] = { 5, 1, 3, 4, 2, 7 };
        Node root = null;
        for (int i = 0; i < val.length; i++) {
            root = insert(root, val[i]);
        }
        inorder(root);

        boolean result = search(root, 9);
        if (result == true) {
            System.out.println("Found");
        } else {
            System.out.println("Not found");
        }

        delete(root, 2);

        System.out.println();

        inorder(root);

    }

}
