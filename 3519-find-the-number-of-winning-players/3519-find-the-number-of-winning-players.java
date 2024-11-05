class Solution {
    public int winningPlayerCount(int n, int[][] pick) {
        Map<Integer,Integer>[] pcolors=new HashMap[n];
        for(int i=0;i<n;i++){
            pcolors[i]=new HashMap<>();
        }
        for(int[] p:pick){
            int player=p[0];
            int color=p[1];
            pcolors[player].put(color,pcolors[player].getOrDefault(color,0)+1);
        }
        int count=0;
        for(int i=0;i<n;i++){
            Map<Integer,Integer> colorCount=pcolors[i];
            for(int c:colorCount.values()){
              if(c>i){
                count++;
                break;
              }  
            }
        }
        return count;
        
    }
}