/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Recursion;

/**
 *
 * @author PC
 */
public class Main {
     public static void main(String[] args) {
    Recursion recur=new Recursion();
    int n=6;
    System.out.println("factorial of "+n+" is: "+recur.factorial(n));
    System.out.println(n+"-th element of fibonacci is: "+recur.fibo(n));
     }
}
