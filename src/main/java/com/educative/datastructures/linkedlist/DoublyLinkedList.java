package com.educative.datastructures.linkedlist;

public class DoublyLinkedList<T> {
    public class Node {
        public T data;
        public Node nextNode;
        public Node prevNode;
    }

    public Node headNode;
    public int size;

    public DoublyLinkedList() {
        this.headNode = null;
    }

    public boolean isEmpty() {
        if (headNode == null) {
            return true;
        }
        return false;
    }

    public void insertAtHead(T data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.nextNode = this.headNode;
        newNode.prevNode = null;
        if (headNode != null) {
            headNode.prevNode = newNode;
        }
        this.headNode = newNode;
        size++;
    }
}
