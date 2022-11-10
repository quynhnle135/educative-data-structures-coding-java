package com.educative.datastructures.graphs;

public class BreadthFirstSearch {
    public static String bfs(Graph g){
        String result = "";
        //Checking if the graph has no vertices
        if (g.vertices < 1){
            return result;
        }

        //Boolean Array to hold the history of visited nodes (by default-false)
        boolean[] visited = new boolean[g.vertices];

        for(int i=0;i<g.vertices;i++)
        {
            //Checking whether the node is visited or not
            if(!visited[i])
            {
                result = result + bfsVisit(g, i, visited);
            }
        }
        return result;
    }
    public static String bfsVisit(Graph g, int source, boolean[] visited) {

        String result = "";

        //Create Queue for Breadth First Traversal and enqueue source in it
        Queue<Integer> queue = new Queue<>(g.vertices);

        queue.enqueue(source);
        visited[source] = true;

        //Traverse while queue is not empty
        while (!queue.isEmpty()) {

            //Dequeue a vertex/node from queue and add it to result
            int current_node = queue.dequeue();

            result += String.valueOf(current_node);

            //Get adjacent vertices to the current_node from the array,
            //and if they are not already visited then enqueue them in the Queue
            DoublyLinkedList<Integer>.Node temp = null;
            if(g.adjacencyList[current_node] != null)
                temp = g.adjacencyList[current_node].headNode;

            while (temp != null) {

                if (!visited[temp.data]) {
                    queue.enqueue(temp.data);
                    visited[temp.data] = true; //Visit the current Node
                }
                temp = temp.nextNode;
            }
        }//end of while
        return result;
    }

    public static void main(String[] args) {
        Graph g1 = new Graph(9);
        g1.addEdge(0, 1);
        g1.addEdge(0, 2);
        g1.addEdge(1, 6);
        g1.addEdge(1, 7);
        g1.addEdge(7, 8);
        g1.addEdge(2, 3);
        g1.addEdge(2, 4);
        g1.addEdge(4, 5);

        g1.printGraph();
        System.out.println(bfs(g1));
    }
}
