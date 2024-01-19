import java.util.LinkedList;
import java.util.Iterator;

class Main {
    public static void main(String args[]){
        // no of nodes -> 6
        int n = 6;
        // adjecency List
        LinkedList[] adjList = new LinkedList[n];
        
        for(int i = 0;i < n;i++){
            adjList[i] = new LinkedList <Integer> ();
        }
        // edges 
        int[][] edges = new int[][]{{0,1},{0,2},{1,3},{1,4},{2,5}};
        // putting values in adjList
        for(int[] edge:edges){
            Integer a = edge[0];
            Integer b = edge[1];
            
            adjList[a].add(b);
        }
        
        // displaying the adjecsncy List
        for(int i = 0;i < n;i++){
            System.out.print(i + "->");
            Iterator it = adjList[i].iterator();
            while(it.hasNext()){
                System.out.print(it.next() + " ");
            }System.out.println();
        }
    }
}