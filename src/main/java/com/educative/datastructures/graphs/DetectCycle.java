package com.educative.datastructures.graphs;

public class DetectCycle {
    public static boolean detectCycle(Graph g) {
        boolean[] stackFlag = new boolean[g.vertices];
        boolean[] visited = new boolean[g.vertices];
        for (int i = 0; i < g.vertices; i++) {
            if (cyclic(g, i, stackFlag, visited)) {
                return true;
            }
        }
        return false;
    }

    public static boolean cyclic(Graph g, int v, boolean[] stackFlag, boolean[] visited) {
        if (stackFlag[v]) {
            return true;
        }

        if (visited[v]) {
            return false;
        }

        stackFlag[v] = true;
        visited[v] = true;
        DoublyLinkedList<Integer>.Node temp = null;
        if (g.adjacencyList[v] != null) {
            temp = g.adjacencyList[v].headNode;

        }
        while (temp != null) {
            if (cyclic(g, temp.data, stackFlag, visited)) {
                return true;
            }
            temp = temp.nextNode;
        }
        stackFlag[v] = false;
        return false;
    }

    public static void main(String[] args) {
        Graph g1 = new Graph(4);
        g1.addEdge(0,1);
        g1.addEdge(1,2);
        g1.addEdge(1,3);
        g1.addEdge(3,0);
        g1.printGraph();
        System.out.println(detectCycle(g1));

        System.out.println();
        Graph g2 = new Graph(3);
        g2.addEdge(0,1);
        g2.addEdge(1,2);
        g2.printGraph();
        System.out.println(detectCycle(g2));
    }
}
