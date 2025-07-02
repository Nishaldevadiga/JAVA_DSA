package BinaryTreestwo;

public class BinaryTreestwo {

    static class Node {
         int data;
         Node rightNode;
         Node leftNode;

         Node(int data){
            this.data=data;
            this.rightNode=null;
            this.leftNode=null;
         }
    }

    static class BinaryTree{
          static int idx=-1;

          public static Node BuildTree(int nodes[]){
            idx++;
               if(nodes[idx]==-1){
                return null;
               }

               Node newNode=new Node(nodes[idx]);
                newNode.leftNode=BuildTree(nodes);
                newNode.rightNode=BuildTree(nodes);
                return newNode;
          }
          public static int height(Node root){
            if(root==null){
                return 0;
            }

            int lefth=height(root.leftNode);
            int righth=height(root.rightNode);
            int height=Math.max(lefth, righth)+1;
            return height;
          }

          public static int diameter(Node root){
            if(root==null){
                return 0;
            }

            int leftdia=diameter(root.leftNode);
            int rightdia=diameter(root.rightNode);
            int lefth=height(root.leftNode);
            int righth=height(root.rightNode);
            int selfdia=lefth+righth+1;

            return Math.max(selfdia,Math.max(rightdia, selfdia));
          }

          static class info{
            int ht;
            int dia;

            info(int ht,int dia){
                this.ht=ht;
                this.dia=dia;
            }
          }

          public static info diameteropt(Node root){
            if(root==null){
               return new info(0,0);
            }

            info leftinfo=diameteropt(root.leftNode);
            info rightinfo=diameteropt(root.rightNode);

            int dia=Math.max(Math.max(leftinfo.dia,rightinfo.dia),leftinfo.ht+rightinfo.ht+1);
            int ht=Math.max(leftinfo.ht, rightinfo.ht)+1;
            

            return new info(ht, dia);


          }
    }

    public static void main(String args[]){
            int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
            BinaryTree tree=new BinaryTree();
            Node root=tree.BuildTree(nodes);
            //System.out.println(root.data);
            //System.out.println(tree.height(root));
            //System.out.println(tree.diameter(root));

            System.out.println(tree.diameteropt(root).dia);

            
           
    }
}
