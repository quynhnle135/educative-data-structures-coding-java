package com.educative.datastructures.graphs;

public class DoublyLinkedList <T> {
    public class Node {
        public T data;
        public Node nextNode;
        public Node prevNode;
    }

    public Node headNode;
    public Node tailNode;
    public int size;

    // Constructor
    public DoublyLinkedList() {
        this.headNode = null;
        this.tailNode = null;
    }

    public boolean isEmpty() {
        if (tailNode == null && headNode == null) return true;
        return false;
    }

    public Node getHeadNode() {
        return this.headNode;
    }

    public Node getTailNode() {
        return this.tailNode;
    }

    public int getSize() {
        return this.size;
    }

    public void insertAtHead(T data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.nextNode = headNode;
        newNode.prevNode = null;
        if (headNode != null) {
            headNode.prevNode = newNode;
            newNode.nextNode = headNode;
        } else {
            tailNode = newNode;
        }
        headNode = newNode;
        size++;
    }

    public void insertAtEnd(T data) {
        if(isEmpty()) {
            insertAtHead(data);
            return;
        }
        Node newNode = new Node();
        newNode.data = data;
        tailNode.nextNode = newNode;
        newNode.prevNode = tailNode;
        tailNode = newNode;
        size++;
    }

    public void deleteAtHead() {
        if (isEmpty()) {
            System.out.println("List is empty!");
            return;
        }
        headNode = headNode.nextNode;
        if (headNode == null) {
            tailNode = null;
        } else {
            headNode.prevNode = null;
        }
        size--;
    }

    public void deleteAtTail() {
        if (isEmpty()) {
            System.out.println("List is emtpy");
            return;
        }
        tailNode = tailNode.prevNode;
        if (tailNode == null) {
            headNode = null;
        } else {
            tailNode.nextNode = null;
        }
        size--;
    }

    public void printList() {
        if (isEmpty()) {
            System.out.println("List is empty!");
            return;
        }
        Node curNode = headNode;
        System.out.print("Doubly LinkedList: <- null -> ");
        while (curNode.nextNode != null) {
            System.out.print(curNode.data + " -> ");
            curNode = curNode.nextNode;
        }
        System.out.print(curNode.data + " -> null");
        System.out.println();
    }
}
