package com.educative.datastructures.linkedlist;

import java.util.HashSet;
import java.util.LinkedList;

public class SinglyLinkedList<T> {
    public class Node {
        public T data;
        public Node nextNode;
    }

    public Node headNode;
    public int size;

    // constructor
    public SinglyLinkedList() {
        headNode = null;
        size = 0;
    }

    public boolean isEmpty() {
        if (headNode == null) return true;
        return false;
    }

    public void printList() {
        Node cur = headNode;
        while (cur != null) {
            System.out.print(cur.data + " -> ");
            cur = cur.nextNode;
        }
        System.out.print("null");
        System.out.println();
    }

    public void insertAtHead(T data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.nextNode = headNode;
        headNode = newNode;
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

        Node last = headNode;
        while (last.nextNode != null) {
            last = last.nextNode;
        }
        last.nextNode = newNode;
        size++;
    }

    public void insertAfter(T data, T previous) {
        Node newNode = new Node();
        newNode.data = data;
        Node cur = headNode;
        while (!cur.data.equals(previous)) {
            cur = cur.nextNode;
        }
        if (cur != null) {
            newNode.nextNode = cur.nextNode;
            cur.nextNode = newNode;
            size++;
        }
    }

    public boolean search(T data) {
        Node cur = headNode;
        while (cur != null) {
            if (cur.data.equals(data)) return true;
            cur = cur.nextNode;
        }
        return false;
    }

    public void deleteAtHead() {
        if (isEmpty()) {
            return;
        }
        headNode = headNode.nextNode;
        size--;
    }

    public void deleteByValue(T data) {
        if (isEmpty()) {
            return;
        }

        Node cur = headNode;
        Node prev = null;

        if (cur.data.equals(data)) {
            deleteAtHead();
            return;
        }
        while (cur != null) {
            if (cur.data.equals(data)) {
                prev.nextNode = cur.nextNode;
                size--;
                return;
            }
            prev = cur;
            cur = cur.nextNode;
        }
    }

    public int length() {
        int count = 0;
        Node cur = headNode;
        while (cur != null) {
            count++;
            cur = cur.nextNode;
        }
        return count;
    }
}
