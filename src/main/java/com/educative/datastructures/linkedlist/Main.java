package com.educative.datastructures.linkedlist;


public class Main {
    public static void main(String[] args) {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        for (int i = 10; i >= 1; i--) {
            list.insertAtHead(i);
        }
        list.printList();
        list.insertAtEnd(12);
        list.printList();
        list.deleteByValue(6);
        list.printList();
        System.out.println("Length of SLL: " + list.length());

        DoublyLinkedList<Integer> doublyList = new DoublyLinkedList<>();
        for (int i = 10; i >= 1; i--) {
            doublyList.insertAtHead(i);
        }
        doublyList.printList();
        doublyList.insertAtEnd(12);
        System.out.println();
        System.out.println("After insert");
        doublyList.printList();
        doublyList.deleteAtHead();
        doublyList.deleteByValue(7);
        System.out.println();
        doublyList.printList();
    }
}
