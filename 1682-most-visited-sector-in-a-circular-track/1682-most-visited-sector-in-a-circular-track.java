class Solution {
    public List<Integer> mostVisited(int n, int[] rounds) {
        int[] ans=new int[n+1];
        for(int i=0;i<rounds.length-1;i++){
            int start=rounds[i];
            int end=rounds[i+1];
            if(start<=end){
                for(int j=start;j<end;j++){
                    ans[j]++;
                }
            }
            else{
                for(int j=start;j<=n;j++){
                    ans[j]++;
                }
                for(int j=1;j<end;j++){
                    ans[j]++;
                }
            }
        }
        ans[rounds[rounds.length - 1]]++;
        int maxVis=0;
        for(int i:ans){
            maxVis=Math.max(maxVis,i);
        }
        List<Integer> lst=new ArrayList<>();
        for(int i=0;i<=n;i++){
            if(ans[i]==maxVis){
                lst.add(i);
            }
        }
        return lst;
        
    }
}