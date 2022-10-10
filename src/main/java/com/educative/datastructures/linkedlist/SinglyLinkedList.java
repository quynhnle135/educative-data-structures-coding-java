package com.educative.datastructures.linkedlist;

import java.util.HashMap;
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
        if (isEmpty()) {
            System.out.println("List is empty");
            return;
        }
        Node cur = headNode;
        while (cur.nextNode != null) {
            System.out.print(cur.data.toString() + " -> ");
            cur = cur.nextNode;
        }
        System.out.println(cur.data.toString() + " -> null");
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

    public Node getHeadNode() {
        return this.headNode;
    }

    public int getSize() {
        return this.size;
    }

    public void removeDuplicatesWithHashing() {
        Node current = this.headNode;
        Node prevNode = this.headNode;
        HashSet<T> visitedNodes = new HashSet<T>();
        if (!isEmpty() && current.nextNode != null) {
            while (current != null) {
                if (visitedNodes.contains(current.data)) {
                    prevNode.nextNode = current.nextNode;
                    current = current.nextNode;
                } else {
                    visitedNodes.add(current.data);
                    prevNode = current;
                    current = current.nextNode;
                }
            }
        }
    }
}
