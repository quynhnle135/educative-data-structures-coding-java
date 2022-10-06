package com.educative.datastructures.linkedlist;

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
        
    }
}
