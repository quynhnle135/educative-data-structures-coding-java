package com.educative.datastructures.tree;

public class Node {
    public int data;
    public Node leftChild;
    public Node rightChild;
    // Constructor
    public Node(int value) {
        this.data = value;
        leftChild = null;
        rightChild = null;
    }

    // Getter and Setter

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }
}
