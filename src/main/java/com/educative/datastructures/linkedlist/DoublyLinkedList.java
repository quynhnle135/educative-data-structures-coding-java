package com.educative.datastructures.linkedlist;

public class DoublyLinkedList<T> {
    public class Node {
        public T data;
        public Node nextNode;
        public Node prevNode;
    }

    public Node headNode;
    public Node tailNode;
    public int size;

    public DoublyLinkedList() {
        this.headNode = null;
        this.tailNode = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        if (headNode == null && tailNode == null) return true;
        return false;
    }

    public void printList() {
        if (isEmpty()) {
            System.out.println("List is empty!");
            return;
        }

        Node cur = headNode;
        System.out.print("List : null <- ");
        while (cur.nextNode != null) {
            System.out.print(cur.data.toString() + " <-> ");
            cur = cur.nextNode;
        }
        System.out.print(cur.data.toString() + " -> null");

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
        if (!isEmpty()) {
            headNode.prevNode = newNode;
        } else {
            tailNode = newNode;
        }
        this.headNode = newNode;
        size++;
    }

    public void insertAtEnd(T data) {
        if (isEmpty()) {
            insertAtHead(data);
            return;
        }
        Node newNode = new Node();
        newNode.data = data;
        newNode.nextNode = null;
        newNode.prevNode = tailNode;
        tailNode.nextNode = newNode;
        tailNode = newNode;
        size++;
    }

    public void deleteAtHead() {
        if (isEmpty()) return;

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

    public void deleteByValue(T data) {
        Node cur = headNode;
        if (cur.data.equals(data)) {
            deleteAtHead();
            return;
        }
        while (cur != null) {
            if (cur.data.equals(data)) {
                cur.prevNode.nextNode = cur.nextNode;
                if (cur.nextNode != null) {
                    cur.nextNode.prevNode = cur.prevNode;
                }
                size--;
            }
            cur = cur.nextNode;
        }
    }
}
