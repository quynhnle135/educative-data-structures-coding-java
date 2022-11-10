package com.educative.datastructures.graphs;

public class Demo {
    public static void main(String[] args) {
        DoublyLinkedList<Integer> dll = new DoublyLinkedList<>();
        dll.insertAtHead(1);
        dll.insertAtHead(2);
        dll.insertAtHead(3);
        dll.insertAtHead(4);
        dll.insertAtHead(5);
        dll.printList();
        dll.insertAtEnd(10);
        dll.insertAtEnd(11);
        dll.insertAtEnd(12);
        dll.insertAtEnd(13);
        dll.printList();
    }
}
