/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LinkedList;

/**
 *
 * @author PC
 */
public class SinglyLinkedList {
    public static class Node{
        int data;
        Node next;
        
        public Node(int x){
            data =x;
            next=null;
        }
    }
    
    Node head,tail;
     public SinglyLinkedList() {
        head =tail=null;
       
    }
    
    
    public SinglyLinkedList(Node head) {
        this.head = head;
        tail=head;
    }
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
    
    void addLast(int data){
        Node node= new Node(data);
        if(isEmpty()){
        head=tail=node;
        }else{
            tail.next=node;
            tail=node;
        }
    }
    /*
    Write a function to add new node
    to the head of the list
    */
    
    void addFirst(int data){
        Node node=new Node(data);
        if(isEmpty()){ 
         head =tail=node;   
        }else{
            node.next=head;
            head=node;
        }   
    }
    /*
    write a funtion to remove the last of the list
    */
    
    void removeTail(){
        
        if(isEmpty()){
        System.out.println("The list is emty");
        }else{
            if(head == tail){
                head =tail=null;
                return;
            }
            Node current=head;
            while(current.next!= tail){
                current=current.next;
            }
            current.next=null;
            tail=current;
          
        }
    }
    /*
    Write a funtion to remove head of the list
    */
    void removeHead(){
        if (isEmpty()){
            System.out.println("The list is empty");
            
        }else{
           if(head==tail){
               head = tail = null;
               return;
           }
           head=head.next;
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

