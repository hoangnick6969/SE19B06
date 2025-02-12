/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StackandQueue;

/**
 *
 * @author PC
 */
public class LinkedListDeque {
    class Node {
        int data;
        Node prev,next;
        
        public Node(int x,Node prev,Node next){
            this.data=x;
            this.prev=prev;
            this.next=next;
        }
        
        public Node(int x){
            this(x,null,null);
        }
        
    }
    
    Node head,tail;
    
    public LinkedListDeque(){
        head=tail=null;
    }
    
    boolean isEmpty(){
        return head==null;
    }
    
    void addLast(int x){
        if(isEmpty()){
            head=tail=new Node(x);
            
        }else{
            Node newNode= new Node(x);
            tail.next=newNode;
            newNode.prev=tail;
            tail=newNode;
        }
    }
    
    void addFirst(int x){ //enqueueFirst
        if(isEmpty()){
            head=tail=new Node(x);

        }else{
            head.prev =new Node(x, null,head);
            head=head.prev;
       
        }
    }
    Node removeFirst(){
        if(isEmpty()){
            System.out.println("the deque is empty");
            return null;
        }else{
            Node temp=head ;
            if(head==tail){
                temp=head;
                head=tail=null;
            }else{
            head=head.next;
            head.prev=null;
            }
               return null;
        }
    }
    
    Node removeLast(){
      if(isEmpty()){
            System.out.println("the deque is empty");
            return null;
        }else{
            Node temp=head ;
            if(head==tail){
                temp=head;
                head=tail=null;
            }else{
            tail=tail.prev;
            tail.next=null;
            }
               return null;
        }
    }
    /*
    first(),last()
    */
    Node first(){
        if(isEmpty()){
            System.out.println("the deque is empty");
            return null;
        }else{
            return head;
        }
    }
    Node last(){
        if(isEmpty()){
            System.out.println("the deque is empty");
            return null;
        }else{
            return tail;
        }
    }
    
    void traverse(){
        if(isEmpty()) System.out.println("deque is empty");
        else{
            Node current=head;
            while(current!=null){
                System.out.println(current.data+"  ");
                current =current.next;
                
            }
            System.out.println();
            
        }
    }
}
