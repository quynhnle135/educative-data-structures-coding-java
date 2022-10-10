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
        headNode = null;
        size = 0;
    }

    public boolean isEmpty() {
        if (headNode == null) return true;
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

    public void insertAtHead(T data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.nextNode = headNode;
        newNode.prevNode = null;
        if (headNode != null) {
            headNode.prevNode = newNode;
        }
        headNode = newNode;
        size++;
    }

    public void insertAtEnd(T data) {
        Node newNode = new Node();
        newNode.data = data;
        Node cur = headNode;
        while (cur.nextNode != null) {
            cur = cur.nextNode;
        }
        cur.nextNode = newNode;
        newNode.prevNode = cur;
        size++;
    }

    public void deleteAtHead() {
        if (isEmpty()) return;

        headNode = headNode.nextNode;
        headNode.prevNode = null;
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
