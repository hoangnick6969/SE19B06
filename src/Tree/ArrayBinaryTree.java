/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tree;

/**
 *
 * @author PC
 */
public class ArrayBinaryTree {
    class Node{
        int data;
        int lchild,rchild,parent;
//        int height;
        public Node(int x){
                this.data=x;
                this.parent=parent;
        }
    }
    
    Node root;
    int length;//total number of nodes
    int capacity;//size of array used to contain nodes
    Node[] arrayNodes;
    public ArrayBinaryTree(int capacity){
        this.length=0;
        this.capacity=capacity;
        this.arrayNodes=new Node[capacity];
    }
    public ArrayBinaryTree(){
        this(7);
    }
    boolean isEmpty(){
        return length == 0;
    }
    
    boolean isFull(){
        return length == capacity;
    }
    
    void insert (int x){
        if(isFull()) increaseSize();
         arrayNodes[length++]=new Node(x);
    }
    void increaseSize(){
        
    }
    void preOrder(int root ){
        if(root>=length) return ;
        if(isEmpty()) System.out.println("Tree is empty");
        else{
            //visit root
            System.out.println(arrayNodes[root].data+ " ");
            //visit left child
//            int lchild=2*root+1;
//            preOrder(lchild);
            preOrder(2*root+1);
            //visit right child
//            int rchild=2*root+2;
//            preOrder(rchild);
            preOrder(2*root+2);
        }
    }
    void preOrder(){
        preOrder(0);
    }
    void postOrder(int root){
        if(root>=length) return ;
        if(isEmpty()) System.out.println("Tree is empty");
        else{
           //visit left child
            postOrder(2*root+1);
            //visit right child
            postOrder(2*root+2);
            //visit root
            System.out.println(arrayNodes[root].data+ " ");
        }
    }
    void postOrder(){
        postOrder(0);
    }
    
        void inOrder(int root){
         if(root>=length) return ;
        if(isEmpty()) System.out.println("Tree is empty");
        else{
            inOrder(2*root+1);
            System.out.println(arrayNodes[root].data+" ");
            inOrder(2*root+2);
        }
    }
         void inOrder(){
        inOrder(0);
}
}

