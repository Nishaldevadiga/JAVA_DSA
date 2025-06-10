package BinaryTrees;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreess {

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

    static class BinaryTree {
        static int idx = -1;

        public static Node BuildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = BuildTree(nodes);
            newNode.right = BuildTree(nodes);
            return newNode;
        }

        public static void PreOrder(Node root){
            if(root==null){
              System.out.print(-1+" ");
              return;
            }
            System.out.print(root.data+"  ");
            PreOrder(root.left);
            PreOrder(root.right);
        }
          public static void Inorder(Node root){
        if(root==null){
            return;
        }
        Inorder(root.left);
        System.out.print(root.data+" ");
        Inorder(root.right);
    }
    public static void postorder(Node root){
        if(root==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }

    public static void levelOrder(Node root){
       
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        

        while(!q.isEmpty()){
            Node currNode=q.remove();
            if(currNode==null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
             System.out.print(currNode.data+" ");
               if(currNode.left!=null){
                q.add(currNode.left);
             }
             if(currNode.right!=null){
                q.add(currNode.right);
             }
           
            }
        }
    }
    }

  

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };

        BinaryTree tree = new BinaryTree();
        Node root = tree.BuildTree(nodes);
        //System.out.print(root.data);
        //tree.PreOrder(root);
        //tree.Inorder(root);
       // tree.postorder(root);
       tree.levelOrder(root);
    }

}
