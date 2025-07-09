class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int old=image[sr][sc];
        if(old==color){
            return image;
        }

        dfs(image,sr,sc,old,color);
            return image;
        
    }    
        private void dfs(int[][]image,int r,int c,int old,int newcolor){
            int n=image.length;
            int m=image[0].length;
            if(r<0 || c<0  || r>=n || c>=m){
                return;
            }
            if(image[r][c]!=old){
                return ;

            }
            image[r][c]=newcolor;

            dfs(image,r+1,c,old,newcolor);
            dfs(image,r-1,c,old,newcolor);
            dfs(image,r,c+1,old,newcolor);
            dfs(image,r,c-1,old,newcolor);
        }


    
}