class Solution {
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
         boolean[][] occupied = new boolean[m][n];  

         
        for (int[] guard : guards) {  
            occupied[guard[0]][guard[1]] = true;  
        }  
        for (int[] wall : walls) {  
            occupied[wall[0]][wall[1]] = true;  
        }  

         
        boolean[][] guarded = new boolean[m][n];  

     
        int[][] directions = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};  

        for (int[] guard : guards) {  
            int r = guard[0], c = guard[1];  

            
            for (int[] direction : directions) {  
                int nr = r, nc = c;  
                while (true) {  
                    nr += direction[0];  
                    nc += direction[1];  

                    
                    if (nr < 0 || nr >= m || nc < 0 || nc >= n) {  
                        break;   
                    }  

                    if (occupied[nr][nc]) {  
                        break;  
                    }  
                    
                    guarded[nr][nc] = true;   
                }  
            }  
        }  

         
        int unguardedCount = 0;  
        for (int i = 0; i < m; i++) {  
            for (int j = 0; j < n; j++) {  
                
                if (!occupied[i][j] && !guarded[i][j]) {  
                    unguardedCount++;  
                }  
            }  
        }  

        return unguardedCount;  

        
    }
}