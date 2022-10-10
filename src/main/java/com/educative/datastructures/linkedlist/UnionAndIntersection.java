//package com.educative.datastructures.linkedlist;
//
//public class UnionAndIntersection {
//    public static <T> SinglyLinkedList<T> union(SinglyLinkedList<T> list1, SinglyLinkedList<T> list2) {
//        if (list1.isEmpty()) {
//            return list2;
//        }
//        if (list2.isEmpty()) {
//            return list1;
//        }
//        SinglyLinkedList<T>.Node last = list1.getHeadNode();
//        while (last.nextNode != null) {
//            last = last.nextNode;
//        }
//        last.nextNode = list2.getHeadNode();
//        list1.removeDuplicateHashing();
//        return list1;
//    }
//
//    public static <T> boolean contains(SinglyLinkedList<T> list, T data) {
//        SinglyLinkedList<T>.Node current = list.getHeadNode();
//        while (current != null) {
//            if (current.data.equals(data)) {
//                return true;
//            }
//            current = current.nextNode;
//        }
//        return false;
//    }
//
//    public static <T> SinglyLinkedList<T> intersection(SinglyLinkedList<T> list1, SinglyLinkedList<T> list2) {
//        SinglyLinkedList<T> result = new SinglyLinkedList<>();
//        if (list1.isEmpty()) {
//            return result;
//        }
//        if (list2.isEmpty()) {
//            return result;
//        }
//        SinglyLinkedList<T>.Node current = list1.getHeadNode();
//        while (current != null) {
//            if (contains(list2, current.data)) {
//                result.insertAtHead(current.data);
//            }
//            current = current.nextNode;
//        }
//        return result;
//    }
//
//    public static void main(String[] args) {
//        SinglyLinkedList<Integer> list1 = new SinglyLinkedList<Integer>();
//        for (int i = 7; i > 3; i--) {
//            list1.insertAtHead(i);
//        }
//        System.out.print("1st ");
//        list1.printList();
//        SinglyLinkedList<Integer> list2 = new SinglyLinkedList<Integer>();
//        for (int i = 0; i < 5; i++) {
//            list2.insertAtHead(i);
//        }
//        System.out.print("2nd ");
//        list2.printList();
//        System.out.print("After Intersection ");
//        intersection(list1, list2).printList();
//        System.out.print("After Union ");
//        union(list1, list2).printList();
//    }
//}
