package Searching;
import java.util.LinkedList;
import java.util.Iterator;

// Adjacency Matrix
class Sample {
    public static void main(String args[]) {
    	int n = 6;
    	LinkedList[] adjList = new LinkedList[n];
    	
    	for(int i = 0;i < n;i++) {
    		adjList[i] = new LinkedList<Integer>();
    	}
    	int[][] edges = new int[][] {{1,4},{4,5},{3,1}};
    	
    	for(int[] edge : edges) {
    		int a = edge[0];
    		int b = edge[1];
    		adjList[a].add(b);
    	}
    	
    	for(int i = 0;i < n;i++) {
    		System.out.print(i + "->");
    		Iterator it = adjList[i].iterator();
    		while(it.hasNext()) {
    			System.out.print(it.next());
    		}System.out.println();
    	}
    	
    	
    }
}