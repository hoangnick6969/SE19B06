/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LinkedList;

/**
 *
 * @author PC
 */
public class DoublyLinkedList {
       public static class Node{
        int data;
        Node next;
        Node prev;
        
        public Node(int x, Node prev,Node next){
            this.data =x;
            this.next=next;
            this.prev=prev;
        }
        public Node(int x){
            this(x,null,null);
        }
    }
       
    
    Node head,tail;
    /*
    write a funtion to check 
    whether the linked list is emty
    */
    boolean isEmpty(){
        return head ==null;
    }
     
    
    /*
    write a function to add new node
    to the last of the linked list
    */
    
    void addLast(int x){
//      Node newNode= new Node(x);        
        if(isEmpty()){
        head=tail=new Node(x);
        }else{
//            tail.next=newNode;
//            newNode.prev=tail;
//            tail=newNode;
            tail.next=new Node(x,tail,null);
            tail=tail.next;
        }
    }
    /*
    Write a function to add new node
    to the head of the list
    */
    
    void addFirst(int x){
        Node newNode=new Node(x);
        if(isEmpty()){ 
         head =tail=newNode;   
        }else{
            head.prev=newNode;
            newNode.next=head;
            head=newNode;
        }   
    }
    /*
    Write a funtion to remove 
    head of the list
    */
    void removeFirst(){
        if (isEmpty()){
            System.out.println("The list is empty");
            
        }else{
           if(head==tail){
               head = tail = null;
               return;
           }
           head=head.next;
           head.prev=null;
        }
    }
    /*
    write a funtion to remove
    the last of the list
    */
    
    void removeTail(){       
        if(isEmpty()){
        System.out.println("The list is emty");
        }else{
            if(head == tail){
                head =tail=null;
                return;
            }
            tail=tail.prev;
            tail.next=null;          
        }
    }
    /*
    write a function to remove node with the specific data
    */
    void removeData(int x){
        if (isEmpty()){
            System.out.println("The list is empty");
        }else{
            if(head==tail){
            if(head.data==x)head=head.next;
                tail=null;
                return;
            }
            Node temp =head;
            while (temp.next != null){
                if(temp.next.data==x){
                    temp.next=temp.next.next;
                    //return;
                }else{
                    temp=temp.next;
                }
            }
         if(head.data==x){
                head=head.next;
                return ;
           }
        }
    }
void removeData2(int x){
        if (isEmpty()){
            System.out.println("The list is empty");
        }else{
           
            while(head!= null && head.data==x)head=head.next;
                if(head==null){
                tail=null;
                return;
            }
            Node temp =head;
            while (temp.next != null){
                if(temp.next.data==x){
                    temp.next=temp.next.next;
//                    return;
                }else{
                    temp=temp.next;
                }
            }
         tail=temp;
        }
}
    
    
    /*
    write two functions to traverse
    and inversely traverse the list
    */
   void traverse() {
        if (isEmpty()) {
            System.out.println("The list is empty");
           
        }else{
        Node current = head;
        while (current != null) {
            // visit the node
            System.out.print(current.data + "  ");
            //move to the next node
            current = current.next;
        }
        System.out.println();
    }
}
        
    void backTraverse() {
        if (isEmpty()) {
            System.out.println("The list is empty");
           
        }
        Node current = tail;
        while (current != null) {
            // visit the node
            System.out.print(current.data + " ");
            //move to the previous node
            current = current.prev;
        }
        System.out.println();
    }    
    /* 
    write a function to display
    the data of the node
    */
    
    void displayData(){ 
        Node current=head;
        while(current!= null){
            System.out.println(current.data+"   ");
            current=current.next;
        }
    }
     

}
