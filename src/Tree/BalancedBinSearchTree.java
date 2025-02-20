/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tree;

/**
 *
 * @author PC
 */
public class BalancedBinSearchTree {
    class Node{
        int data;
        Node left,right;
        public Node(int x, Node left ,Node right){
            this.data=x;
            this.left=left;
            this.right=right;
        }
        public Node(int x){
            this(x, null, null);
        }
    }
    Node root;
    public BalancedBinSearchTree(){
        root=null;
    }
    boolean isEmpty(){
        return root==null;
    }
    int height(Node node){
        if(node.left==null&& node.right==null) return 1;
        return 1+ maxInt(height(node.left), height(node.right));
    }
    int maxInt(int a,int b){
        return a>b? a:b;
    }
     boolean isBalanced(){
        return Math.abs(height(root.left)-height(root.right))<=1;
    }
      Node insertRec(int x, Node node){
        if(node==null){
            node =new Node(x);
            return node;
        }
        if(x<node.data)node.left=insertRec(x,node.left);
        if(x>node.data)node.right=insertRec(x,node.right);
        return node;
    }
      void insertRec(int x){
        root= insertRec(x,root);
    }
      void balance(Node node){
          //save tree to array 
          Node[] arrayNodes=new Node[20];
          saveOrder(root, arrayNodes, 0);
          for( Node x:arrayNodes) {
              System.out.println(x.data+"   ");
          }
          
          
      }
      void balance(){
          balance(root);
      }
      
      void saveOrder(Node root,Node[]arr,int idx){
        if (isEmpty())return ;
        else{
            //visit left child
            if (root.left != null) saveOrder(root.left,arr,idx);
            //visit root
            arr[idx+1]=root;
            //visit right child
            if (root.right != null) saveOrder(root.right,arr,idx+2);
        }
    }
    
}
