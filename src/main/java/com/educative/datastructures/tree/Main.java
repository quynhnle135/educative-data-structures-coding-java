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

        System.out.println("Root of the tree: " + bsT.getRoot().getData());
        System.out.println("Tree: ");
        bsT.printTree(bsT.getRoot());
        System.out.println();
//        Node temp = bsT.search(5);
        Node temp1 = bsT.searchRecursive(5);
//        if (temp != null) {
//            System.out.println("\n" + temp.getData() + " found in Tree !");
//        }
        if (temp1 != null) {
            System.out.println("\n" + temp1.getData() + " found in Tree !");
        }
//        temp = bsT.search(51);
        temp1 = bsT.searchRecursive(51);
//        if (temp != null) {
//            System.out.println("\n" + temp.getData() + " found in Tree !");
//        }
        if (temp1 != null) {
            System.out.println("\n" + temp1.getData() + " found in Tree !");
        }

    }
}
