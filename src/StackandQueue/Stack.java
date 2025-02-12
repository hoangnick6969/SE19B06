/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package StackandQueue;

/**
 *
 * @author PC
 */
public class Stack {


    public static void main(String[] args) {

//                  ArrayStack aStack=new ArrayStack();
//                  aStack.push(3);
//                  aStack.push(4);
//                  aStack.push(5);
//                  aStack.push(7);
//                  aStack.push(6);
//                  aStack.push(9);
//                  aStack.traverse();
//                  System.out.println("Node is Pop: ");
//                  System.out.println(aStack.pop().data);
//                  System.out.println("the list after calling opfunction");
//                  aStack.traverse();
           LinkedListDeque lQueue=new LinkedListDeque()       ;
           lQueue.addLast(3);
           lQueue.addLast(7);
           lQueue.addLast(8);
           lQueue.addLast(5);
           lQueue.addLast(6);
           lQueue.traverse();
           
           System.out.println("The list after add first elenment");
         lQueue.addFirst(4);
            lQueue.traverse();
         
    }
    
}
