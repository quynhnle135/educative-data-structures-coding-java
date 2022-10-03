package com.educative.datastructures.linkedlist;

import java.util.LinkedList;

public class SinglyLinkedList<T> {

    class Node {
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
        if (headNode == null) {
            return true;
        }
        return false;
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
        Node currentNode = this.headNode;
        while (currentNode != null && !currentNode.data.equals(previous)) {
            currentNode = currentNode.nextNode;
        }
        if (currentNode != null) {
            newNode.nextNode = currentNode.nextNode;
            currentNode.nextNode = newNode;
            size++;
        }
    }

    public boolean searchNode(T data) {
        Node currentNode = this.headNode;
        while (currentNode != null) {
            if (currentNode.data.equals(data)) {
                return true;
            }
            currentNode = currentNode.nextNode;
        }
        return false;
    }

    public void printList() {
        if (isEmpty()) {
            System.out.println("List is empty");
            return;
        }
        Node temp = headNode;
        System.out.println("List: ");
        while (temp.nextNode != null) {
            System.out.print(temp.data.toString() + " -> ");
            temp = temp.nextNode;
        }
        System.out.println(temp.data.toString() + " -> null");
    }

    public void deleteAtHead() {
        if (isEmpty()) {
            return;
        }
        headNode = headNode.nextNode;
        size--;
    }

    public static void main(String[] args) {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        for (int i = 1; i <= 10; i++) {
            list.insertAtEnd(i);
        }
        list.printList();
        System.out.println(list.searchNode(8)); // true
        System.out.println(list.searchNode(11)); // false
        list.insertAfter(17, 7);
        list.printList();
        list.deleteAtHead();
        list.printList();
    }
}
