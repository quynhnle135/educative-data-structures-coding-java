package com.educative.datastructures.tree;
public class Main {
    public static void main(String[] args) {
        BinarySearchTree bsT = new BinarySearchTree();

        bsT.add(6);
        bsT.add(4);
        bsT.add(9);
        bsT.add(5);
        bsT.add(2);
        bsT.add(8);
        bsT.add(12);
        bsT.add(10);
        bsT.add(14);

        System.out.println(bsT.getRoot().getData());
        bsT.printTree(bsT.getRoot());
    }
}
