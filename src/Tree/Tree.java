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
//            bst.insert(10);
//            bst.insert(5);
//            bst.insert(3);
//            bst.insert(8);
//            bst.insert(20);
//            bst.insert(15);
//            bst.insertRec(30);
//            bst.insertRec(20);
//            bst.insertRec(50);
//            bst.insertRec(10);
//            bst.insertRec(25);
//            bst.insertRec(40);
//            bst.insertRec(35);
//            bst.insertRec(45);
//            bst.insertRec(55);
//            System.out.println("Pre-order traverse: ");
//            bst.preOrder();
//           
//             System.out.println("In order traverse: ");
//            bst.inOrder();
//          
////            System.out.println("Post order traverse: ");
////            bst.postOrder();
//            System.out.println("\n=========================");
////            bst.deleteByMerging(50);
//            bst.deleteByCopying(50);
//            System.out.println("Pre-order traverse: ");
//            bst.preOrder();
//            
//             System.out.println("In order traverse: ");
//            bst.inOrder();
//           
////            System.out.println("Post order traverse: ");
////            bst.postOrder();
// System.out.println("\n=========================");
          
            BalancedBinSearchTree balancedBST=new BalancedBinSearchTree();
            balancedBST.insertRec(30);
            balancedBST.insertRec(20);
            balancedBST.insertRec(50);
            balancedBST.insertRec(40);
            balancedBST.insertRec(60);
            balancedBST.insertRec(55);
            balancedBST.insertRec(65);
            balancedBST.balance();
            balancedBST.preOrder();
            balancedBST.postOrder();
            balancedBST.balanceRot();
    }
}
