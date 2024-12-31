class Solution {
    public int mincostTickets(int[] days, int[] costs) {
       Map<Integer,Boolean> travel=new HashMap<>();
       for(int i:days){
        travel.put(i,true);
       } 

       int[] dp=new int[366];
       for(int i=1;i<=365;i++){
        if(!travel.containsKey(i)){
            dp[i]=dp[i-1];
            continue;
        }
        int cost1=dp[Math.max(0,i-1)]+costs[0];
        int cost7=dp[Math.max(0,i-7)]+costs[1];
        int cost30=dp[Math.max(0,i-30)]+costs[2];
        dp[i]=Math.min(cost1,Math.min(cost7,cost30));
       }
       return dp[365];
    }
}