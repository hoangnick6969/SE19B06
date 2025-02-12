/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LinkedList;

/**
 *
 * @author PC
 */
public class CircularlyLinkedList {
    class Node{
        int data ;
        Node next;
        
        public Node(int x){
            this.data=x;
            this.next=null;
        }
    }
    Node head;
    
    public CircularlyLinkedList(){
        head =null;
    }
    boolean isEmpty(){
        return head==null;
        
    }
    /*
    write a funtcion to add
    new node to the last of the list
    */
    void addLast(int x){
        Node newNode=new Node(x);
          // Duyet head neu head rong
        if(isEmpty()){
            head=newNode;
            head.next=head;
        }else {
            Node current= head;
            while (current.next != head ){
            current=current.next;
        }
            current.next=new Node(x);
            newNode.next=head;
        }
        
    }
    void addFirst(int x){
         Node newNode=new Node(x);
          // Duyet head neu head rong
        if(isEmpty()){
            head=newNode;
            head.next=head;
        }else {
            Node current= head;
            while (current.next != head ){
            current=current.next;
        }
            current.next=new Node(x);
            newNode.next=head;
            head=newNode.next;
        }
        
    }
    void removeFirst(){
        if (isEmpty())System.out.println("Lis is empty");
        else{
            if(head.next==head)head=null;
        else{
                 Node current= head;
                while (current.next != head ){
                current=current.next;
                }
                current.next=head.next;
                head=head.next;
            }   
        }
    }
    void removeLast(){
        
    }
    void traverse(){
        if(head==null){
            System.out.println ("The list is Empty");
            return;
        }
            Node current=head;
            System.out.println("Traversing the list");
            do{
        System.out.println(current.data+" ");
        current=current.next;
        
        }while(current!=head);
            System.out.println();
        
    }
}
