//package com.educative.datastructures.graphs;
//
//public class BreadthFirstSearch {
//    public static String bfs(Graph g) {
//        String result = "";
//        if (g.vertices < 1) {
//            return result;
//        }
//
//        boolean[] visited = new boolean[g.vertices];
//        for (int i = 0; i < g.vertices; i++) {
//            if (!visited[g.vertices]) {
//                result = result + findBFS(g, i, visited);
//            }
//        }
//        return result;
//    }
//
//    public static String findBFS(Graph g, int source, boolean[] visited) {
//        String result = "";
//        Queue<Integer> queue = new Queue<>(g.vertices);
//        queue.enqueue(source);
//        while (!queue.isEmpty()) {
//            int current_node = queue.dequeue();
//            result =
//        }
//        return result;
//    }
//    public static void main(String[] args) {
//        Graph g = new Graph(5);
//        g.addEdge(0,1);
//        g.addEdge(0,2);
//        g.addEdge(1,3);
//        g.addEdge(1,4);
//        System.out.println("Graph1:");
//        g.printGraph();
//        System.out.println("BFS traversal of Graph1 : " + bfs(g));
//        System.out.println();
//    }
//}
