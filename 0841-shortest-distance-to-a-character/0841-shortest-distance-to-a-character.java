class Solution {
    public int[] shortestToChar(String s, char c) {
        int n=s.length();
        int[] ans=new int[n];
       // int minInd=0;
        List<Integer> lst=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(s.charAt(i)==c){
                lst.add(i);
            }
        }
        for(int i=0;i<n;i++){
            int minInd=Integer.MAX_VALUE;
            for(int j=0;j<lst.size();j++){
               minInd=Math.min(minInd,Math.abs(i-lst.get(j)));
            }
            ans[i]=minInd;
        }
        return ans;

        
    }
}