class Solution {
    public long pickGifts(int[] gifts, int k) {
        int n=gifts.length;
    
        for(int j=0;j<k;j++){
            int max=0;
        for(int i=1;i<n;i++){
            if(gifts[i]>gifts[max]){
                max=i;
            }
        }
            gifts[max]=(int)Math.floor(Math.sqrt(gifts[max]));
            
        }
        long sum=0;
        for(int i=0;i<n;i++){
            sum+=gifts[i];
        }
        
            
          
        return sum;
        
        
    }
}