package com.educative.datastructures.linkedlist;


public class FindMidNode {
    public static <T> Object findMiddle(SinglyLinkedList<T> list) {
        if (list.isEmpty()) {
            return null;
        }
        SinglyLinkedList<T>.Node mid = list.headNode;
        SinglyLinkedList<T>.Node cur = list.headNode;
        while (mid != null && cur != null && cur.nextNode != null) {
            cur = cur.nextNode.nextNode;
            if (cur != null) {
                mid = mid.nextNode;
            }
        }
        return mid.data;
    }

    public static <T> Object findMid(SinglyLinkedList<T> list) {
        if (list.isEmpty()) {
            return null;
        }
        int size = list.size;
        int pos = 0;
        if (size % 2 == 0) {
            pos = size / 2;
        } else {
            pos = (size / 2) + 1;
        }
        SinglyLinkedList<T>.Node cur = list.headNode;
        while (cur != null && pos > 1) {
            cur = cur.nextNode;
            pos--;
        }
        if (cur != null) {
            return cur.data;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        for (int i = 1; i <= 15; i++) {
            list.insertAtEnd(i);
        }
        list.printList();
        System.out.println("Size: " + list.size);
        System.out.println("Mid element: " + findMiddle(list));
        System.out.println("Mid element: " + findMid(list));
    }
}
