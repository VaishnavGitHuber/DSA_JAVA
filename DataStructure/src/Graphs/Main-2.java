class Main {
    public static void main(String args[]){
        // no of nodes 
        int n = 6;
        // adjecency matrix
        int[][] adjMatrix = new int[n][n];
        // edges 
        int[][] edges = new int[][]{{0,1},{0,2},{2,5},{1,3},{1,4}};
        
        for(int[] edge: edges){
            int a = edge[0];
            int b = edge[1];
            // setting 1 for directed edges 
            adjMatrix[a][b] = 1;
        }
        
        // printing the adjency matrix
        System.out.println("Adjecency Matrix");
        for(int i = 0;i < n;i++){
            for(int j = 0;j < n;j++){
                System.out.print(adjMatrix[i][j] + " ");
            }System.out.println();
        }
    }
}