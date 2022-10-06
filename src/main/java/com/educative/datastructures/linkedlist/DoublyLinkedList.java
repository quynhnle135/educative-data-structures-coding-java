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
        if (headNode == null && tailNode == null) {
            return true;
        }
        return false;
    }

    public Node getHeadNode() {
        return headNode;
    }

    public Node getTailNode() {
        return tailNode;
    }

    public int getSize() {
        return size;
    }

    public void insertAtHead(T data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.nextNode = this.headNode;
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
        tailNode = newNode;
        size++;
    }

    public void printList() {
        if (isEmpty()) {
            System.out.println("List is empty");
            return;
        }
        Node tempNode = headNode;
        System.out.print("List: <- null -> ");
        while (tempNode.nextNode != null) {
            System.out.print(tempNode.data.toString() + " <-> ");
            tempNode = tempNode.nextNode;
        }
        System.out.print(tempNode.data.toString() + " -> null");
        System.out.println();
    }

    public void deleteAtHead() {
        if (isEmpty()) {
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
        if (isEmpty()) {
            return;
        }

        Node currentNode = this.headNode;
        if (currentNode.data.equals(data)) {
            deleteAtHead();
            return;
        }

        while (currentNode != null) {
            if (currentNode.data.equals(data)) {
                currentNode.prevNode.nextNode = currentNode.nextNode;
                if (currentNode.nextNode != null) {
                    currentNode.nextNode.prevNode = currentNode.prevNode;
                }
                size--;
            }
            currentNode = currentNode.nextNode;
        }
    }

    public int length() {
        Node currentNode = this.headNode;
        int count = 0;
        while (currentNode != null) {
            count++;
            currentNode = currentNode.nextNode;
        }
        return count;
    }

    public static void main(String[] args) {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        for (int i = 1; i <= 5; i++) {
            list.insertAtHead(i);
        }
        list.printList();
        list.insertAtHead(17);
        list.insertAtEnd(20);
        list.printList();
        list.deleteAtTail();
        list.printList();
        System.out.println(list.length());
        System.out.println(list.size);
    }
}
