package test;

import java.util.LinkedList;

public class Graph {
	int vertexCount;
	LinkedList<Integer> adjListArray[];
	Graph(int V) {
		this.vertexCount = V;
		adjListArray = new LinkedList[vertexCount];
		for (int i = 0; i < vertexCount; i ++) {
			adjListArray[i] = new LinkedList();
 		}
	}
	
	void addEdge(int source, int destination) {
		adjListArray[source].add(destination);
		adjListArray[destination].add(source);
	}
	
	void printGraph() {
		for(int v= 0; v < this.vertexCount; v++) {
			System.out.println("Adjacency list of vertext " + v + " is ");
			for (Integer val: adjListArray[v]) {
				System.out.println("---> " + val);
			}
			System.out.println("\n");
		}
	}
	
	public static void main(String[] args) {
		Graph graph = new Graph(5);
		graph.addEdge(0, 1);
		graph.addEdge(0, 4);
		graph.addEdge(1, 3);
		graph.addEdge(1, 4);
		graph.addEdge(2, 3);
		graph.addEdge(3, 4);
		
		graph.printGraph();
		
		
	}
}
