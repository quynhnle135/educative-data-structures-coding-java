package com.educative.datastructures.linkedlist.hackerrank;

public class Node {
    public Node next;
    public int data;

    public Node() {

    }

    public Node(int data) {
        this.data = data;
    }

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "next=" + next +
                ", data=" + data +
                '}';
    }

    public static void traverse(Node headNode) {
        if (headNode == null) return;
        while (headNode != null) {
            System.out.print(headNode.data + " -> ");
            headNode = headNode.next;
        }
        System.out.print("null");
        System.out.println();
    }

    public static Node reverse(Node headNode) {
        Node cur = headNode;
        Node prev = null;
        while (cur != null) {
            Node nextTemp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = nextTemp;
        }
        return prev;
    }

    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        traverse(node1);
        traverse(reverse(node1));
    }
}
