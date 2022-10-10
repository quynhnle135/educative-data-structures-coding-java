//package com.educative.datastructures.linkedlist;
//
//public class NthNodeFromTheEnd {
//    public static <T> Object nthNodeFromTheEnd(SinglyLinkedList<T> list, int n) {
//        int size = list.getSize();
//        n = size - n + 1;
//        if (size == 0 || n > size) {
//            return null;
//        }
//        SinglyLinkedList<T>.Node current = list.headNode;
//        int count = 1;
//        while (current != null) {
//            if (count == n) {
//                return current.data;
//            }
//            count++;
//            current = current.nextNode;
//        }
//        return null;
//    }
//
//    public static void main(String[] args) {
//        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
//        for (int i = 1; i <= 10; i++) {
//            list.insertAtEnd(i);
//        }
//        list.printList();
//        System.out.println("Size of list: " + list.size);
//        System.out.println("Element 4th from the end: " + nthNodeFromTheEnd(list, 4));
//    }
//}
