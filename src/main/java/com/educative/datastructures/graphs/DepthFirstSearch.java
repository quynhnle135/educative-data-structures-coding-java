package com.educative.datastructures.graphs;

public class DepthFirstSearch {
    public static String dfs(Graph g) {
        String result = "";
        boolean[] visited = new boolean[g.vertices];
        if (g.vertices < 1) {
            return result;
        }
        for (int i = 0; i < g.vertices; i++) {
            if (!visited[i]) {
                result = result + callDFS(g, i, visited);
            }
        }
        return result;
    }

    public static String callDFS(Graph g, int source, boolean[] visited) {
        String result = "";
        Stack<Integer> stack = new Stack<>(g.vertices);
        stack.push(source);
        visited[source] = true;
        while (!stack.isEmpty()) {
            int current_node = stack.pop();
            result += String.valueOf(current_node);

            DoublyLinkedList<Integer>.Node temp = null;
            if (g.adjacencyList[current_node] != null) {
                temp = g.adjacencyList[current_node].headNode;
            }
            while (temp != null) {
                if (!visited[temp.data]) {
                    stack.push(temp.data);
                }
                temp = temp.nextNode;
            }
            visited[current_node] = true;
        }
        return result;
    }

    public static void main(String[] args) {
        Graph g = new Graph(9);
        g.addEdge(0,1);
        g.addEdge(0,2);
        g.addEdge(1,6);
        g.addEdge(1,7);
        g.addEdge(7,8);
        g.addEdge(2,3);
        g.addEdge(2,4);
        g.addEdge(4,5);
        System.out.println("Graph1:");
        g.printGraph();
        System.out.println("DFS traversal of Graph1 : " + dfs(g));
        System.out.println();

    }
}
