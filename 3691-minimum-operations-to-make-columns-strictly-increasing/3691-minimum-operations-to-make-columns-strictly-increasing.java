class Solution {
    public int minimumOperations(int[][] grid) {
         int m = grid.length;  
        int n = grid[0].length;  
        int operations = 0;  

        for (int j = 0; j < n; j++) {  
            for (int i = 1; i < m; i++) {  
                  
                if (grid[i][j] <= grid[i - 1][j]) {  
                     
                    int increment = grid[i - 1][j] - grid[i][j] + 1;  
                    operations += increment;  
              
                    grid[i][j] += increment;  
                }  
            }  
        }  

        return operations; 
        
    }
}