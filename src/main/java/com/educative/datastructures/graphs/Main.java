package com.educative.datastructures.graphs;

public class Main {
    public static void main(String[] args) {
        Graph g1 = new Graph(9);
        g1.addEdge(1, 2);
        g1.addEdge(1, 3);
        g1.addEdge(2, 3);
        g1.addEdge(2, 4);
        g1.addEdge(3, 5);
        g1.addEdge(4, 7);
        g1.addEdge(5, 4);
        g1.addEdge(5, 6);
        g1.addEdge(6, 7);
        g1.addEdge(7, 8);


        g1.printGraph();

    }
}
