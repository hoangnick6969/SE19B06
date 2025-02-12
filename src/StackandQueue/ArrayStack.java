/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StackandQueue;

/**
 *
 * @author PC
 */
public class ArrayStack {
    class Node{
        int data;
        public Node(int x){
            this.data=x;
        }
    }
    
    
    Node[] arrayNode;
    int capacity;
    int lastIdx;
    public ArrayStack(int capacity){
        this.arrayNode=new Node[capacity];
        this.lastIdx=-1;
        this.capacity=capacity;
    }
    
    public ArrayStack(){
       this(5);
    }
    
    boolean isEmpty(){
       return lastIdx==-1; 
    }
    
    boolean isFull(){
    return lastIdx == capacity-1;
    }
    
    void push(int x){
        if(isFull()) increaseCap();
        arrayNode [++lastIdx]=new Node(x);
        
    }
    Node pop(){
//        Node pNode= new arrayNode[lastIdx--];
//        return pNode;
        return arrayNode[lastIdx--];
    }
    void increaseCap(){
     int newCapacity=capacity *2;
     Node[] newArrayNode= new Node[newCapacity];
     System.arraycopy(arrayNode, 0, newArrayNode, 0,capacity);
     arrayNode=newArrayNode;
     capacity=newCapacity;
     
    }
    void traverse(){
        if(isEmpty()){
            System.out.println("This file is Empty!");
        return ;
        }else {
    for(int i=0;i<=lastIdx;i++){
        System.out.println(arrayNode[i].data+"  ");
    }
    }
}
}
