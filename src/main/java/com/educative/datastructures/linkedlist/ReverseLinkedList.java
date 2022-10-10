package com.educative.datastructures.linkedlist;

import java.lang.annotation.Native;

public class ReverseLinkedList {
    public static <T> void reverse(SinglyLinkedList<T> list) {
        SinglyLinkedList<T>.Node cur = list.headNode;
        SinglyLinkedList<T>.Node prev = null;
        SinglyLinkedList<T>.Node next = null;

        while (cur != null) {
            next = cur.nextNode;
            cur.nextNode = prev;
            prev = cur;
            cur = next;
        }
        list.headNode = prev;
    }

    public static void main(String[] args) {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        for (int i = 1; i <= 10; i++) {
            list.insertAtEnd(i);
        }
        list.printList();
        reverse(list);
        System.out.println("After reverse");
        list.printList();
    }
}
