package Tree;
import java.util.*;

public class heightofTree {
    static class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data=data;
            this.left=left;
            this.right= right;

        }
    }
    //height function
    public static int height(Node root){
        if(root==null){
            return 0;

        }
        int lh=height(root.left);
        int rh= height(root.right);
        return Math.max(lh, rh)+1;
    }
    //counting of nodes functions
    public static int count (Node root){
        if(root==null){
            return 0;

        }
      int  leftCount=count(root.left);
      int rightCount=count(root.right);
      return leftCount+rightCount+1;
    }
    //sum of nodes 
    public static int sum(Node root){
        if(root==null){
            return 0;

        }
        int leftSum= sum(root.left);
        int rightSum= sum(root.right);
        return leftSum+rightSum+root.data;
    }
   
    //diameter  of treee
    public static int diameter2(Node root){
        if(root==null){
            return 0;
        }
        int leftDiam=diameter2(root.left);
        int leftht=height(root.left);
        int rightDiam=diameter2(root.right);
        int rightht=height(root.right);

        int selfDiam=leftht+rightht+1;
        return Math.max(selfDiam,Math.max(leftDiam,rightDiam));

    }
    //approach 2
    // static class Info{
//         int diam;
//         int ht;
//         public Info(int diam,int ht){
//             this.diam=diam;
//             this.ht=ht;
//         }
//     }
//     public static Info diameter(Node root){
//         if(root==null){
//             return new Info(0, 0);
//         }
//         Info leftInfo=diameter(root.left);
//         Info rightInfo=diameter(root.right);
//         int diam=(Math.max(leftInfo.diam, rightInfo.diam,leftInfo.ht,rightInfo.ht+1);
//         int ht=Math.max(leftInfo.ht, rightInfo,ht)+1;
// return new Info(diam, ht);
//     }

    public static void main(String[] args) {
        Node root= new Node(1);
        root.left= new Node(2);
        root.right= new Node(3);
        root.left.left= new Node(4);
        root.left.right= new Node(5);
        root.right.left= new Node(6);
        root.right.right= new Node(7);
        root.left.left.left= new Node(8);

        // System.out.println(height(root));


        // int ans= count(root);
        // System.out.println("total root is:" +ans);

        // System.out.println(sum(root));

        // System.out.println(diameter2(root));/
    }
    
}
