class Solution {
    public int[] finalPrices(int[] prices) {
        int n=prices.length;
        //List<Integer> lst=new ArrayList<>();
        int[] ans=new int[n];
       for(int i=0;i<n;i++){
        ans[i]=prices[i];
       }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
            
                if( prices[j]<=prices[i]){
                    ans[i]=ans[i]-prices[j];
                    break;
                }
               
            }
        }
       return  ans;

        
    }
}