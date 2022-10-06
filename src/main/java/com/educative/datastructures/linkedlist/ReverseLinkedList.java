package com.educative.datastructures.linkedlist;

import java.lang.annotation.Native;

public class ReverseLinkedList {
    public static <T> void reverse(SinglyLinkedList<T> list) {
        SinglyLinkedList<T>.Node previous = null;
        SinglyLinkedList<T>.Node current = list.headNode;
        SinglyLinkedList<T>.Node next = null;

        while (current != null) {
            next = current.nextNode;
            current.nextNode = previous;
            previous = current;
            current = next;
        }
        list.headNode = previous;
    }

    public static void main(String[] args) {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        for (int i = 10; i >= 1; i--) {
            list.insertAtHead(i);
        }
        list.printList();
    }
}
