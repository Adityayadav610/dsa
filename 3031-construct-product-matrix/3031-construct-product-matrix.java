class Solution {
    public int[][] constructProductMatrix(int[][] grid) {
        int MOD=12345;
        int n=grid.length;
        int m=grid[0].length;
        int [][] ans=new int[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                ans[i][j]=1;
            }
        }
        long nul=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                ans[i][j]=(int)(nul*ans[i][j]%MOD);
                nul=nul*grid[i][j]%MOD;
            }
        }
        nul=1;
        for(int i=n-1;i>=0;i--){
            for(int j=m-1;j>=0;j--){
                ans[i][j]=(int)(nul*ans[i][j] %MOD);
                nul=nul*grid[i][j]%MOD;
            }
        }
        return ans;
        
    }
}