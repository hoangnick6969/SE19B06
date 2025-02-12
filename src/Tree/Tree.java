/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tree;

/**
 *
 * @author PC
 */
public class Tree {
    public static void main(String[] args) {
//        ArrayBinaryTree aBinTree= new ArrayBinaryTree();
//        aBinTree.insert(3);
//        aBinTree.insert(5);
//        aBinTree.insert(7);
//        aBinTree.insert(9);
//        aBinTree.insert(6);
//        aBinTree.insert(4);
//        aBinTree.insert(2);
//        System.out.println("Pre-order traverse");
//        aBinTree.preOrder();
//        System.out.println("\nPost-order traverse");
//        aBinTree.postOrder();
//        System.out.println("\nIn-order traverse");
//        aBinTree.inOrder();
            BinarySearchTree bst=new BinarySearchTree();
            bst.insert(10);
            bst.insert(5);
            bst.insert(3);
            bst.insert(8);
            bst.insert(20);
            bst.insert(15);
            System.out.println("Pre-order traverse: ");
            bst.preOrder();
             System.out.println("In-order traverse: ");
            bst.inOrder();
    }
}
