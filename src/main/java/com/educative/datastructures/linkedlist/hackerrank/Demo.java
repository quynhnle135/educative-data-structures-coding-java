package com.educative.datastructures.linkedlist.hackerrank;

public class Demo {
    public static void main(String[] args) {
//        Node node1 = new Node();
//        node1.data = 1;
//        Node node2 = new Node();
//        node2.data = 2;
//        Node node3 = new Node();
//        node3.data = 3;
//
//        System.out.println(node1.next);
//        System.out.println(node2.next);
//        System.out.println(node3.next);
//
//        System.out.println(node1.data);
//        System.out.println(node2.data);
//        System.out.println(node3.data);
//
//        Node node4 = new Node(4);
//        Node node5 = new Node(5);
//        Node node6 = new Node(6);
//
//        System.out.println(node4.data);
//        System.out.println(node5.data);
//        System.out.println(node6.data);

//        node1.next = node2;
//        node2.next = node3;
//        System.out.println(node1.next); // 2
//        System.out.println(node2.next); // 3

        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;


        traverse(node1);
        System.out.println();
        traverse(reverse(node1));
    }

    public static void traverse(Node head) {
        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.print("null");
        System.out.println();
    }

//    public static Node reverseOpt(Node head) {
//        Node cur = head;
//        if (cur == null) {
//            return cur;
//        }
//        Node prev = null;
//        while (cur != null) {
//            Node nextTemp = cur.next;
//            prev = cur;
//            cur = nextTemp;
//        }
//        return prev;
//    }

//    public static Node reverse(Node head) {
//        // 1 -> 2 -> 3 -> 4 -> 5 -> 6
//        Node cur = head;
//        Node temp2 = cur.next; // 1 -> 2
//        cur.next = null; // <- null <- 1
//        Node temp3 = temp2.next; // 2 -> 3
//        temp2.next = cur; // null <- 1 <- 2 3 -> 4
//        Node temp4 = temp3.next; // 3 -> 4
//        temp3.next = temp2; // null <- 1 <- 2 <- 3
//        Node temp5 = temp4.next; // null <- 1 <- 2 <- 3 4 -> 5 -> 6
//        temp4.next = temp3; // null <- 1 <- 2 <- 3 <- 4
//        Node temp6 = temp5.next;
//        temp5.next = temp4; //
//        temp6.next = temp5;
//        return temp6;
//    }

    public static Node reverse(Node head) {
        Node cur = head;
        Node prev = null;
        while (cur != null) {
            Node nextTemp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = nextTemp;
        }
        return prev;
    }
}
