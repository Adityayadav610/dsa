class NeighborSum {
    private int[][] grid;  
    private int rows;  
    private int cols;

    public NeighborSum(int[][] grid) {
        this.grid=grid;
        this.rows=grid.length;
        this.cols=grid[0].length;
        
    }
    
    public int adjacentSum(int value) {
        int sum=0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(grid[i][j]==value){
                    if(i>0) sum+=grid[i-1][j];
                    if(i<rows-1) sum+=grid[i+1][j];
                    if(j>0) sum+=grid[i][j-1];
                    if(j<cols-1) sum+=grid[i][j+1];
                    return sum;
                }

            }
        }
        return sum;
        
    }
    
    public int diagonalSum(int value) {
         int sum = 0;  
       
        for (int i = 0; i < rows; i++) {  
            for (int j = 0; j < cols; j++) {  
                if (grid[i][j] == value) {  
                    
                    if (i > 0 && j > 0) sum += grid[i - 1][j - 1];  
                   
                    if (i > 0 && j < cols - 1) sum += grid[i - 1][j + 1];  
                  
                    if (i < rows - 1 && j > 0) sum += grid[i + 1][j - 1];  
                    
                    if (i < rows - 1 && j < cols - 1) sum += grid[i + 1][j + 1];  
                    return sum; 
                }  
            }  
        }  
        return sum; 
        
    }
}

/**
 * Your NeighborSum object will be instantiated and called as such:
 * NeighborSum obj = new NeighborSum(grid);
 * int param_1 = obj.adjacentSum(value);
 * int param_2 = obj.diagonalSum(value);
 */