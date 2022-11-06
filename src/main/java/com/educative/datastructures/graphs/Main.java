package com.educative.datastructures.graphs;

public class Main {
    public static void main(String[] args) {
        Graph g1 = new Graph(4);
        g1.addEdge(0, 1);
        g1.addEdge(0, 2);
        g1.addEdge(1, 2);
        g1.addEdge(2, 3);
        g1.addEdge(1, 3);
        g1.printGraph();
    }
}
