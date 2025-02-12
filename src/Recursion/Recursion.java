/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Recursion;

/**
 *
 * @author PC
 */
public class Recursion {

    /*
    Recursion consists 2 parts
    base case: used to stop recursion
    inductive case: used to solve smallest problem
    */
 /*
 write recursion-based function
 to calculate the factorial of n
 */
    int factorial(int n){
       if(n<0){
           System.out.println("error");
           return -1;
       }else{
           if(n==0)return 1;//base case
           else return n*factorial(n-1); //induvtive case
       }
    }
    
    /*
    write recursion-based function to calculate
    the n-th element of fibonacci sequence
    0,1,1,2,3,5,8,13,...
    */
    int fibo(int n){
     if(n<0){
           System.out.println("error");
           return -1;   
    }else{
         if(n==1)return 0;
         if(n==2)return 1;
         return fibo(n-1)+fibo(n-2);
     }
    }
    
}
