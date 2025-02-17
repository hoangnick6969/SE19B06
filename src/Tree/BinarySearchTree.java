/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tree;

/**
 *
 * @author PC
 */
public class BinarySearchTree {
 /*
    using Linked list to implement binary search tree
    */   
    class Node{
        int data;
        Node right, left;
        public Node(int x){
            this.data=x;
            this.right=this.right=null;
            
        }
    }
    Node root;
    public BinarySearchTree(){
        this.root=null;
    }
    boolean isEmpty(){
        return root==null;
    }
    void insert(int x){
        if(isEmpty()) root=new Node(x);
        Node temp=root;
        Node temp1=null;
        while(temp!=null){
            temp1=temp;
            if(temp.data>x) temp=temp.left;
            else if(temp.data<x) temp=temp.right;
            else return ;
        }
        if(temp1.data>x) temp1.left=new Node(x);
        if(temp1.data<x) temp1.right=new Node(x);
        
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
    void preOrder(Node root){
        if (isEmpty()) System.out.println("Empty");  
        else{
            System.out.println(root.data+ " ");
            if (root.left != null) preOrder(root.left);
            if (root.right != null) preOrder(root.right);
        }
    }
    
    Node findNode(int x, Node root){
        if(root==null) return null;
        if(root.data==x)return root;
        if(root.data>x) root=findNode(x, root.left);
        if(root.data<x) root=findNode(x, root.right);
        return root;
    }
    
    Node findNode(int x){
        Node node=findNode(x,root);
        if(root==null) System.out.println("Not found");
        return null;
    }
    Node findMostRightInLeft(Node root){
        if(root.left==null) return root;
        Node current =root.left;//move to left subtree
        while(current.right!=null){
            current=current.right;
        }
        return current;
    }
    Node deleteByMerging(int x,Node root){
      if(root==null){
          return null;
      }
      if(root.data<x){
          root.right=deleteByMerging(x, root.right);
        }else if(root.data>x){
            root.left=deleteByMerging(x, root.left);
        }else{
            if(root.left==null){
                root=root.right;
            }
            if(root.right==null){
                return root.left;
            }
            Node mostRight=findMostRightInLeft(root);
            mostRight.right=root.right;
            return root.left;
            
        }
      return root;
        
    }
    void deleteByMerging(int x){
        Node node=deleteByMerging(x, root);
    }
            
    void preOrder(){
        preOrder(root);
    }
    void inOrder(Node root){
        if (isEmpty()) System.out.println("Empty");  
        else{
            
            if (root.left != null) inOrder(root.left);
            System.out.println(root.data+ " ");
            if (root.right != null) inOrder(root.right);
        }
    }
    void inOrder(){
        inOrder(root);
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
}
