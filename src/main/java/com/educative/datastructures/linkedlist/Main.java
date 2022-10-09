package com.educative.datastructures.linkedlist;


public class Main {
    public static void main(String[] args) {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        for (int i = 1; i <= 10; i++) {
            list.insertAtHead(i);
        }
        list.printList();
    }
}
