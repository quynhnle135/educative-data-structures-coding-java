package com.educative.datastructures.graphs;

import com.educative.datastructures.linkedlist.DoublyLinkedList;
import com.educative.datastructures.practice.stackandqueue.Queue;

public class BreadthFirstSearch {
    public static String bfs(Graph g) {
        String result = "";
        if (g.vertices < 1) {
            return  result;
        }

        boolean[] visited = new boolean[g.vertices];
        for (int i = 0; i < g.vertices; i++) {
            if (!visited[i]) {
                result = result + bfsVisit(g, i , visited);
            }
        }
        return result;
    }

    public static String bfsVisit(Graph g, int source, boolean[] visited) {
        String result = "";

        // Create queue for bfs traversal and enqueue source in it
        Queue<Integer> queue = new Queue<>(g.vertices);
        queue.enqueue(source);
        visited[source] = true;

        // traverse while queue is not empty
        while (!queue.isEmpty()) {
            int current_node = queue.dequeue();
            result += String.valueOf(current_node);

            DoublyLinkedList<Integer>.Node temp = null;

            if (g.adjacencyList[current_node] != null) {
                temp = g.adjacencyList[current_node].headNode;
            }
            while (temp != null) {
                if (!visited[temp.data]) {
                    queue.enqueue(temp.data);
                    visited[temp.data] = true;
                }
                temp = temp.nextNode;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Graph g = new Graph(5);
        g.addEdge(0,1);
        g.addEdge(0,2);
        g.addEdge(1,3);
        g.addEdge(1,4);
        System.out.println("Graph1:");
        g.printGraph();
        System.out.println("BFS traversal of Graph1 : " + bfs(g));
        System.out.println();
    }
}
