package com.educative.datastructures.linkedlist;

import javax.lang.model.element.Name;

public class RemoveDuplicate {
    public static <T> void removeDuplicates(SinglyLinkedList<T> list) {
        SinglyLinkedList<T>.Node current = list.headNode;
        SinglyLinkedList<T>.Node compare = null;
        while (current != null && current.nextNode != null) {
            compare = current;
            while (compare != null && compare.nextNode != null) {
                if (current.data.equals(compare.nextNode.data)) {
                    compare.nextNode = compare.nextNode.nextNode;
                } else {
                    compare = compare.nextNode;
                }
            }
            current = current.nextNode;
        }
    }

    public static void main(String[] args) {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        for (int i = 1; i <= 10; i++) {
            list.insertAtEnd(i);
        }

//        list.insertAtEnd(0);
        list.insertAtEnd(1);
        list.insertAtEnd(3);
        System.out.println("Before");
        list.printList();
        System.out.println("After");
        removeDuplicates(list);
        list.printList();
    }
}
