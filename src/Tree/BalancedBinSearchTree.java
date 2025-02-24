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
    int idx=0;
    public BalancedBinSearchTree(){
        root=null;
    }
    boolean isEmpty(){
        return root==null;
    }
    int height(Node node){
        if(node==null) return 0;
        if(node.left==null&& node.right==null) return 1;
        return 1+ maxInt(height(node.left), height(node.right));
    }
    int maxInt(int a,int b){
        return a>b? a:b;
    }
     boolean isBalanced(Node node) {
    if (node == null) return true;
    int balanceFactor = Math.abs(height(node.left) - height(node.right));
    return balanceFactor <= 1 && isBalanced(node.left) && isBalanced(node.right);
}
     int getBalance(Node node){
         return height(node.left)-height(node.right);
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
      
      void balance(int fIdx,int lIdx,Node[] nodes){
          if(fIdx>lIdx)return ;
          int mid =(fIdx+lIdx)/2;
       insertRec(nodes[mid].data);
          balance(fIdx,mid-1,nodes);
          balance(mid+1,lIdx,nodes);
      }
      void balance(){
          //save tree to array 
          Node[] arrayNodes=new Node[20];
          saveOrder(root, arrayNodes);
          for(int i=0;i<idx;i++){
              System.out.print(arrayNodes[i].data+"");
          }
          root=null;//delete tree
          int firstIdx=0,lastIdx=idx;
          int mid =(firstIdx+lastIdx)/2;
          balance(firstIdx,lastIdx,arrayNodes);
          
      }
      
      Node balanceRot(Node node){
            if(getBalance(root)<-1){//right subtree hegher than left subtree
                if(getBalance(node.right)>0){// left subtree higher than right subtree (of node.right)
                    node.right=rightRotate(node.right);
                }
                node =leftRotate(node);
        }
            if(getBalance(node)>1){
                if(getBalance(node.left)<0){
                    node.left=leftRotate(node.left);
                }
                node=rightRotate(node);
            }
            return node;
      }
      void balanceRot(){
          root=balanceRot(root);
      }
      
      Node leftRotate(Node root){
          Node temp=root.right;
          Node temp2=temp.left;

          temp2.left=root;
          root.right=temp2;
          return temp;
      }
      
      
      Node rightRotate(Node root){
          Node temp=root.left;
          Node temp2=temp.right;
          temp2.right=root;
          root.left=temp2;
          return temp;
      }
      Node insertBalance(int x,Node node){
          if(node==null){
            node =new Node(x);
            return node;
        }
         if(x<node.data)node.left=insertBalance(x,node.left);
        if(x>node.data)node.right=insertBalance(x,node.right);
        node =balanceRot(node);
        return node ;
    
      }
      void insertBalance(int x){
          root=insertBalance( x,root);
      }
      void saveOrder(Node root,Node[]arr){
        if (isEmpty())return ;
        else{
            //visit left child
            if (root.left != null) saveOrder(root.left,arr);
            //visit root
            arr[idx++] = root;
            //visit right child
            if (root.right != null) saveOrder(root.right,arr);
        }
    }
          void postOrder(Node root){
       if (isEmpty()) System.out.println("Empty");  
        else{
            
            if (root.left != null) postOrder(root.left);
            if (root.right != null) postOrder(root.right);
             System.out.println(root.data+ " ");
        } 
    }
        void postOrder(){
        postOrder(root);
    }
        
    void preOrder(Node root) {
          if (isEmpty()) System.out.println("Empty");  
          else{
               System.out.println(root.data+ " ");
               if (root.left != null) preOrder(root.left);
               if (root.right != null) preOrder(root.right);
               }
       }

       void preOrder(){
           preOrder(root);
       }
    
}
