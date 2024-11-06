class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sumAlice = 0, sumBob = 0;  

          
        for (int candy : aliceSizes) {  
            sumAlice += candy;  
        }  
        for (int candy : bobSizes) {  
            sumBob += candy;  
        }  

        
        int diff = (sumAlice - sumBob) / 2;  

          
        HashSet<Integer> bobSet = new HashSet<>();  
        for (int candy : bobSizes) {  
            bobSet.add(candy);  
        }  

         
        for (int aCandy : aliceSizes) {  
            int bCandy = aCandy - diff;  
            if (bobSet.contains(bCandy)) {  
                return new int[] { aCandy, bCandy };  
            }  
        }  
        throw new IllegalArgumentException("No valid exchange found");  
        
        
    }
}