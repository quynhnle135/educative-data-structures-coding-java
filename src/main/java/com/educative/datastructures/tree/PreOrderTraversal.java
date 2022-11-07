package com.educative.datastructures.tree;

public class PreOrderTraversal {
    public static void preTraverse(Node root) {
        if (root == null) return;

        System.out.print(root.getData() + " ");
        preTraverse(root.getLeftChild());
        preTraverse(root.getRightChild());
    }

    public static void main(String[] args) {
        BinarySearchTree BST = new BinarySearchTree();
        BST.add(6);
        BST.add(4);
        BST.add(2);
        BST.add(5);
        BST.add(9);
        BST.add(8);
        BST.add(12);
        System.out.print("Tree traverse normally: ");
        BST.printTree(BST.getRoot());
        System.out.println();
        System.out.print("Preorder Traversal: ");
        preTraverse(BST.getRoot());
    }
}
