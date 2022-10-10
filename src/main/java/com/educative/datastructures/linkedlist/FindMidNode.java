//package com.educative.datastructures.linkedlist;
//
//public class FindMidNode {
//    public static <T> Object findMidNode(SinglyLinkedList<T> list) {
//        if (list.isEmpty()) {
//            return null;
//        }
//        SinglyLinkedList<T>.Node mid = list.headNode;
//        SinglyLinkedList<T>.Node current = list.headNode;
//        while (mid != null && current != null && current.nextNode != null) {
//            current = current.nextNode.nextNode;
//            if (current != null) {
//                mid = mid.nextNode;
//            }
//        }
//        return mid.data;
//    }
//
//    public static <T> Object findMid(SinglyLinkedList<T> list) {
//        if (list.isEmpty()) {
//            return null;
//        }
//        int size = list.size;
//        int pos = -1;
//        if (size % 2 == 0) {
//            pos = size / 2 - 1;
//        } else {
//            pos = size / 2;
//        }
//
//        SinglyLinkedList<T>.Node current = list.headNode;
//        while (current != null && pos > 0) {
//            pos--;
//            current = current.nextNode;
//        }
//        if (current != null) {
//            return current.data;
//        }
//        return -1;
//    }
//
//    public static void main(String[] args) {
//        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
//        for (int i = 5; i >= 1; i--) {
//            list.insertAtHead(i);
//        }
//        list.printList();
//        System.out.println("Middle node of list is: " + findMidNode(list));
//        System.out.println("Middle node of list is : " + findMid(list));
//
//        System.out.println("Another list");
//        SinglyLinkedList<Integer> myList = new SinglyLinkedList<>();
//        for (int i = 10; i >= 1; i--) {
//            list.insertAtHead(i);
//        }
//        list.printList();
//        System.out.println("Middle node of list is: " + findMidNode(list));
//        System.out.println("Middle node of list is : " + findMid(list));
//    }
//}
