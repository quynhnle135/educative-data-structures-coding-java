package com.educative.datastructures.tree;

public class PostOrderTraversal {
    public static void postOrderTraverse(Node root) {
        if (root == null) return;
        postOrderTraverse(root.getLeftChild());
        postOrderTraverse(root.getRightChild());
        System.out.print(root.getData() + " ");
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

        System.out.println("Tree traverse normally: ");
        BST.printTree(BST.getRoot());
        System.out.println();
        System.out.println("Postorder Traversal: ");
        postOrderTraverse(BST.getRoot());
    }
}
